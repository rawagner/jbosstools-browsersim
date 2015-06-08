/*******************************************************************************
 * Copyright (c) 2007-2013 Red Hat, Inc. and others.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jboss.tools.browsersim.browser;

/*******************************************************************************
 * Copyright (c) 2003, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.OpenWindowListener;
import org.eclipse.swt.browser.VisibilityWindowListener;
import org.eclipse.swt.internal.SWTEventListener;

/** 
 * This listener interface may be implemented in order to receive
 * a {@link ExtendedWindowEvent} notification when a window hosting a
 * {@link Browser} needs to be displayed or hidden.
 * 
 * @see Browser#addVisibilityWindowListener(VisibilityWindowListener)
 * @see Browser#removeVisibilityWindowListener(VisibilityWindowListener)
 * @see OpenWindowListener
 * @see ExtendedCloseWindowListener
 * 
 */
public interface ExtendedVisibilityWindowListener extends SWTEventListener {
	
/**
 * This method is called when the window hosting a <code>Browser</code> 
 * is requested to be hidden. Application would typically hide the
 * {@link org.eclipse.swt.widgets.Shell} that hosts the <code>Browser</code>.
 * <p>
 *
 * <p>The following fields in the <code>ExtendedWindowEvent</code> apply:
 * <ul>
 * <li>(in) widget the <code>Browser</code> that needs to be hidden
 * </ul>
 *
 * @param event the <code>ExtendedWindowEvent</code> that specifies the
 * <code>Browser</code> that needs to be hidden
 * 
 * @see org.eclipse.swt.widgets.Shell#setVisible(boolean)
 * 
 */ 
public void hide(ExtendedWindowEvent event);

/**
 * This method is called when the window hosting a <code>Browser</code>
 * is requested to be displayed. Application would typically set the 
 * location and the size of the {@link org.eclipse.swt.widgets.Shell} 
 * that hosts the <code>Browser</code>, if a particular location and size
 * are specified. The application would then open that <code>Shell</code>.
 * <p>
 *
 * <p>The following fields in the <code>ExtendedWindowEvent</code> apply:
 * <ul>
 * <li>(in) widget the <code>Browser</code> to display
 * <li>(in) location the requested location for the <code>Shell</code> 
 * hosting the browser. It is <code>null</code> if no location is set. 
 * <li>(in) size the requested size for the <code>Browser</code>.
 * The client area of the <code>Shell</code> hosting the
 * <code>Browser</code> should be large enough to accommodate that size.
 * It is <code>null</code> if no size is set.
 * <li>(in) addressBar <code>true</code> if the <code>Shell</code> 
 * hosting the <code>Browser</code> should display an address bar or
 * <code>false</code> otherwise
 * <li>(in) menuBar <code>true</code> if the <code>Shell</code> 
 * hosting the <code>Browser</code> should display a menu bar or
 * <code>false</code> otherwise
 * <li>(in) statusBar <code>true</code> if the <code>Shell</code> 
 * hosting the <code>Browser</code> should display a status bar or
 * <code>false</code> otherwise
 * <li>(in) toolBar <code>true</code> if the <code>Shell</code> 
 * hosting the <code>Browser</code> should display a tool bar or
 * <code>false</code> otherwise
 * </ul>
 *
 * @param event the <code>ExtendedWindowEvent</code> that specifies the
 * <code>Browser</code> that needs to be displayed
 * 
 * @see org.eclipse.swt.widgets.Control#setLocation(org.eclipse.swt.graphics.Point)
 * @see org.eclipse.swt.widgets.Control#setSize(org.eclipse.swt.graphics.Point)
 * @see org.eclipse.swt.widgets.Shell#open()
 * 
 */ 
public void show(ExtendedWindowEvent event);

}