/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.ui.factory.relationships;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.graphics.Color;

import com.archimatetool.editor.ui.factory.AbstractElementUIProvider;



/**
 * Abstract Relation UI Provider
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractRelationshipUIProvider extends AbstractElementUIProvider {
    
    @Override
    public Color getDefaultColor() {
        return ColorConstants.black;
    }
    
    @Override
    public Color getDefaultLineColor() {
        return ColorConstants.black;
    }
}
