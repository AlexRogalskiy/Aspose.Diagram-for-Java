/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.Diagrams;

import com.aspose.diagram.*;
import com.aspose.diagram.examples.Utils;

public class ExportToImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExportToImage.class);

        // Call the diagram constructor to load diagram from a VSD file
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

        // Save as PNG
        diagram.save(dataDir+ "Drawing1.png", SaveFileFormat.PNG);

        System.out.println("Process Completed Successfuly");
    }
}




