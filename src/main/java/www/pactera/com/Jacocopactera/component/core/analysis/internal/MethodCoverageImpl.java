/*******************************************************************************
 * Copyright (c) 2009, 2020 Mountainminds GmbH & Co. KG and Contributors
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Marc R. Hoffmann - initial API and implementation
 *
 *******************************************************************************/
package www.pactera.com.Jacocopactera.component.core.analysis.internal;


import www.pactera.com.Jacocopactera.component.core.analysis.ICounter;
import www.pactera.com.Jacocopactera.component.data.IMethodCoverage;


public class MethodCoverageImpl extends SourceNodeImpl
		implements IMethodCoverage {

	private final String desc;

	private final String signature;

	public MethodCoverageImpl(final String name, final String desc,
                              final String signature) {
		super(ElementType.METHOD, name);
		this.desc = desc;
		this.signature = signature;
	}

	@Override
	public void increment(final ICounter instructions, final ICounter branches,
						  final int line) {
		super.increment(instructions, branches, line);
		// Additionally increment complexity counter:
		if (branches.getTotalCount() > 1) {
			final int c = Math.max(0, branches.getCoveredCount() - 1);
			final int m = Math.max(0, branches.getTotalCount() - c - 1);
			this.complexityCounter = this.complexityCounter.increment(m, c);
		}
	}

	public void incrementMethodCounter() {
		final ICounter base = this.instructionCounter.getCoveredCount() == 0
				? CounterImpl.COUNTER_1_0
				: CounterImpl.COUNTER_0_1;
		this.methodCounter = this.methodCounter.increment(base);
		this.complexityCounter = this.complexityCounter.increment(base);
	}

	// === IMethodCoverage implementation ===

	public String getDesc() {
		return desc;
	}

	public String getSignature() {
		return signature;
	}

}
