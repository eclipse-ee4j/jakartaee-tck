/*
 * Copyright (c) 2007, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

/*
 * $Id$
 */

/*
 * @(#)TestBean.java	1.3 02/08/21
 */

package com.sun.ts.tests.ejb.ee.timer.session.stateless.cm;

import java.util.Properties;

import jakarta.ejb.EJBLocalObject;
import jakarta.ejb.TimerHandle;

public interface TestBeanLocal extends EJBLocalObject {
  public TimerHandle initializeTimerHandle(int timerType, int timeoutAction);

  public boolean cancelAndRollback(TimerHandle handle);

  public boolean cancelTimer(TimerHandle handle);

  public void cancelAllTimers();

  public void initLogging(Properties p);
}
