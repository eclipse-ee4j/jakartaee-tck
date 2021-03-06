/*
 * Copyright (c) 2013, 2018, 2020 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.ts.tests.ejb30.bb.async.stateful.annotated;

import com.sun.ts.tests.ejb30.bb.async.common.annotated.AsyncBeanBase;
import com.sun.ts.tests.ejb30.bb.async.common.annotated.AsyncIF;

import jakarta.ejb.Local;
import jakarta.ejb.Remote;
import jakarta.ejb.Stateful;

@Stateful
@Local({ StatefulAsync2IF.class, StatefulAsyncIF.class })
@Remote({ StatefulAsync2RemoteIF.class, StatefulAsyncRemoteIF.class })
// StatefulAsync2IF and StatefulAsyncIF are its business interfaces. AsyncIF is
// not
// its business interface, though it was implemented by bean class.
public class Async2Bean extends AsyncBeanBase implements AsyncIF {
}
