/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.chart;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import org.odftoolkit.odfdom.dom.type.OdfCellRangeAddressList;
import org.odftoolkit.odfdom.dom.type.chart.OdfDataSourceHasLabelsType;
import org.odftoolkit.odfdom.dom.type.dr3d.OdfProjectionType;
import org.odftoolkit.odfdom.dom.type.dr3d.OdfShadeModeType;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.OdfId;


/**
 * ODF DOM Element implementation for element "<chart:plot-area>".
 */
public abstract class OdfPlotAreaElement extends OdfStylableElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = -360037012490394100L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.CHART, "plot-area" );

    public OdfPlotAreaElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME, OdfStyleFamily.Chart, OdfName.get( OdfNamespace.CHART, "style-name" ) );
    }

    @Override
	public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "svg:x".
     */
    public String getX()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ) );
    }

    /**
     * Set value of attribute "svg:x".
     */
    public void setX( String _aX )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ), _aX );
    }

    /**
     * Get value of attribute "svg:y".
     */
    public String getY()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ) );
    }

    /**
     * Set value of attribute "svg:y".
     */
    public void setY( String _aY )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ), _aY );
    }

    /**
     * Get value of attribute "svg:width".
     */
    public String getWidth()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "width" ) );
    }

    /**
     * Set value of attribute "svg:width".
     */
    public void setWidth( String _aWidth )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "width" ), _aWidth );
    }

    /**
     * Get value of attribute "svg:height".
     */
    public String getHeight()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "height" ) );
    }

    /**
     * Set value of attribute "svg:height".
     */
    public void setHeight( String _aHeight )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "height" ), _aHeight );
    }

    /**
     * Get value of attribute "chart:style-name".
     */
    @Override
	public String getStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.CHART, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "chart:style-name".
     */
    @Override
	public void setStyleName( String _aStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.CHART, "style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "table:cell-range-address".
     */
    public String getCellRangeAddress()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "cell-range-address" ) );
        return OdfCellRangeAddressList.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:cell-range-address".
     */
    public void setCellRangeAddress( String _aCellRangeAddress )
    {                    
        String aStringVal = OdfCellRangeAddressList.toString( _aCellRangeAddress );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "cell-range-address" ), aStringVal );
    }

    /**
     * Get value of attribute "chart:data-source-has-labels".
     */
    public OdfDataSourceHasLabelsType getDataSourceHasLabels()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.CHART, "data-source-has-labels" ) );
        return OdfDataSourceHasLabelsType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "chart:data-source-has-labels".
     */
    public void setDataSourceHasLabels( OdfDataSourceHasLabelsType _aDataSourceHasLabels )
    {                    
        String aStringVal = OdfDataSourceHasLabelsType.toString( _aDataSourceHasLabels );
        setOdfAttribute( OdfName.get( OdfNamespace.CHART, "data-source-has-labels" ), aStringVal );
    }

    /**
     * Get value of attribute "dr3d:vrp".
     */
    public String getVrp()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "vrp" ) );
    }

    /**
     * Set value of attribute "dr3d:vrp".
     */
    public void setVrp( String _aVrp )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "vrp" ), _aVrp );
    }

    /**
     * Get value of attribute "dr3d:vpn".
     */
    public String getVpn()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "vpn" ) );
    }

    /**
     * Set value of attribute "dr3d:vpn".
     */
    public void setVpn( String _aVpn )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "vpn" ), _aVpn );
    }

    /**
     * Get value of attribute "dr3d:vup".
     */
    public String getVup()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "vup" ) );
    }

    /**
     * Set value of attribute "dr3d:vup".
     */
    public void setVup( String _aVup )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "vup" ), _aVup );
    }

    /**
     * Get value of attribute "dr3d:projection".
     */
    public OdfProjectionType getProjection()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "projection" ) );
        return OdfProjectionType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "dr3d:projection".
     */
    public void setProjection( OdfProjectionType _aProjection )
    {                    
        String aStringVal = OdfProjectionType.toString( _aProjection );
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "projection" ), aStringVal );
    }

    /**
     * Get value of attribute "dr3d:distance".
     */
    public String getDistance()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "distance" ) );
    }

    /**
     * Set value of attribute "dr3d:distance".
     */
    public void setDistance( String _aDistance )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "distance" ), _aDistance );
    }

    /**
     * Get value of attribute "dr3d:focal-length".
     */
    public String getFocalLength()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "focal-length" ) );
    }

    /**
     * Set value of attribute "dr3d:focal-length".
     */
    public void setFocalLength( String _aFocalLength )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "focal-length" ), _aFocalLength );
    }

    /**
     * Get value of attribute "dr3d:shadow-slant".
     */
    public String getShadowSlant()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "shadow-slant" ) );
    }

    /**
     * Set value of attribute "dr3d:shadow-slant".
     */
    public void setShadowSlant( String _aShadowSlant )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "shadow-slant" ), _aShadowSlant );
    }

    /**
     * Get value of attribute "dr3d:shade-mode".
     */
    public OdfShadeModeType getShadeMode()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "shade-mode" ) );
        return OdfShadeModeType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "dr3d:shade-mode".
     */
    public void setShadeMode( OdfShadeModeType _aShadeMode )
    {                    
        String aStringVal = OdfShadeModeType.toString( _aShadeMode );
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "shade-mode" ), aStringVal );
    }

    /**
     * Get value of attribute "dr3d:ambient-color".
     */
    public String getAmbientColor()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "ambient-color" ) );
    }

    /**
     * Set value of attribute "dr3d:ambient-color".
     */
    public void setAmbientColor( String _aAmbientColor )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "ambient-color" ), _aAmbientColor );
    }

    /**
     * Get value of attribute "dr3d:lighting-mode".
     */
    public Boolean getLightingMode()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "lighting-mode" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "dr3d:lighting-mode".
     */
    public void setLightingMode( Boolean _aLightingMode )
    {                    
        String aStringVal = OdfBoolean.toString( _aLightingMode );
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "lighting-mode" ), aStringVal );
    }

    /**
     * Get value of attribute "dr3d:transform".
     */
    public String getTransform()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "transform" ) );
    }

    /**
     * Set value of attribute "dr3d:transform".
     */
    public void setTransform( String _aTransform )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "transform" ), _aTransform );
    }

    /**
     * Get value of attribute "xml:id".
     */
    public String getXmlid()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xml:id".
     */
    public void setXmlid( String _aXmlid )
    {                    
        String aStringVal = OdfId.toString( _aXmlid );
        setOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ), aStringVal );
    }

}