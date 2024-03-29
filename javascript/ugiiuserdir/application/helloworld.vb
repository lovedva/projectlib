﻿'==============================================================================
'  WARNING!!  This file is overwritten by the Block UI Styler while generating
'  the automation code. Any modifications to this file will be lost after
'  generating the code again.
'
'       Filename:  D:\workspace\projectlib\javascript\计算\NXOPENdemo\helloworld.vb
'
'        This file was generated by the NX Block UI Styler
'        Created by: Erica'J
'              Version: NX 2008
'              Date: 07-01-2022  (Format: mm-dd-yyyy)
'              Time: 22:41 (Format: hh-mm)
'
'==============================================================================

'==============================================================================
'  Purpose:  This TEMPLATE file contains VB.NET source to guide you in the
'  construction of your Block application dialog. The generation of your
'  dialog file (.dlx extension) is the first step towards dialog construction
'  within NX.  You must now create a NX Open application that
'  utilizes this file (.dlx).
'
'  The information in this file provides you with the following:
'
'  1.  Help on how to load and display your Block UI Styler dialog in NX
'      using APIs provided in NXOpen.BlockStyler namespace
'  2.  The empty callback methods (stubs) associated with your dialog items
'      have also been placed in this file. These empty methods have been
'      created simply to start you along with your coding requirements.
'      The method name, argument list and possible return values have already
'      been provided for you.
'==============================================================================

'------------------------------------------------------------------------------
'These imports are needed for the following template code
'------------------------------------------------------------------------------
Option Strict Off
Imports System
Imports NXOpen
Imports NXOpen.BlockStyler

'------------------------------------------------------------------------------
'Represents Block Styler application class
'------------------------------------------------------------------------------
Public Class helloworld
    'class members
    Private Shared theSession As Session
    Private Shared theUI As UI
    Private theDlxFileName As String
    Private theDialog As NXOpen.BlockStyler.BlockDialog
    Private group0 As NXOpen.BlockStyler.Group
    Private selection0 As NXOpen.BlockStyler.SelectObject' Block type: Selection
    Private colorPicker0 As NXOpen.BlockStyler.ObjectColorPicker' Block type: Color Picker
    '------------------------------------------------------------------------------
    'Bit Option for Property: SnapPointTypesEnabled
    '------------------------------------------------------------------------------
    Public Shared ReadOnly Dim              SnapPointTypesEnabled_UserDefined As Integer =     1
    Public Shared ReadOnly Dim                 SnapPointTypesEnabled_Inferred As Integer =     2
    Public Shared ReadOnly Dim           SnapPointTypesEnabled_ScreenPosition As Integer =     4
    Public Shared ReadOnly Dim                 SnapPointTypesEnabled_EndPoint As Integer =     8
    Public Shared ReadOnly Dim                 SnapPointTypesEnabled_MidPoint As Integer =    16
    Public Shared ReadOnly Dim             SnapPointTypesEnabled_ControlPoint As Integer =    32
    Public Shared ReadOnly Dim             SnapPointTypesEnabled_Intersection As Integer =    64
    Public Shared ReadOnly Dim                SnapPointTypesEnabled_ArcCenter As Integer =   128
    Public Shared ReadOnly Dim            SnapPointTypesEnabled_QuadrantPoint As Integer =   256
    Public Shared ReadOnly Dim            SnapPointTypesEnabled_ExistingPoint As Integer =   512
    Public Shared ReadOnly Dim             SnapPointTypesEnabled_PointonCurve As Integer =  1024
    Public Shared ReadOnly Dim           SnapPointTypesEnabled_PointonSurface As Integer =  2048
    Public Shared ReadOnly Dim         SnapPointTypesEnabled_PointConstructor As Integer =  4096
    Public Shared ReadOnly Dim     SnapPointTypesEnabled_TwocurveIntersection As Integer =  8192
    Public Shared ReadOnly Dim             SnapPointTypesEnabled_TangentPoint As Integer = 16384
    Public Shared ReadOnly Dim                    SnapPointTypesEnabled_Poles As Integer = 32768
    Public Shared ReadOnly Dim         SnapPointTypesEnabled_BoundedGridPoint As Integer = 65536
    Public Shared ReadOnly Dim         SnapPointTypesEnabled_FacetVertexPoint As Integer = 131072
    Public Shared ReadOnly Dim            SnapPointTypesEnabled_DefiningPoint As Integer = 262144
    '------------------------------------------------------------------------------
    'Bit Option for Property: SnapPointTypesOnByDefault
    '------------------------------------------------------------------------------
    Public Shared ReadOnly Dim             SnapPointTypesOnByDefault_EndPoint As Integer =     8
    Public Shared ReadOnly Dim             SnapPointTypesOnByDefault_MidPoint As Integer =    16
    Public Shared ReadOnly Dim         SnapPointTypesOnByDefault_ControlPoint As Integer =    32
    Public Shared ReadOnly Dim         SnapPointTypesOnByDefault_Intersection As Integer =    64
    Public Shared ReadOnly Dim            SnapPointTypesOnByDefault_ArcCenter As Integer =   128
    Public Shared ReadOnly Dim        SnapPointTypesOnByDefault_QuadrantPoint As Integer =   256
    Public Shared ReadOnly Dim        SnapPointTypesOnByDefault_ExistingPoint As Integer =   512
    Public Shared ReadOnly Dim         SnapPointTypesOnByDefault_PointonCurve As Integer =  1024
    Public Shared ReadOnly Dim       SnapPointTypesOnByDefault_PointonSurface As Integer =  2048
    Public Shared ReadOnly Dim     SnapPointTypesOnByDefault_PointConstructor As Integer =  4096
    Public Shared ReadOnly Dim     SnapPointTypesOnByDefault_BoundedGridPoint As Integer = 65536
    Public Shared ReadOnly Dim     SnapPointTypesOnByDefault_FacetVertexPoint As Integer = 131072
    
#Region "Block Styler Dialog Designer generator code"
    '------------------------------------------------------------------------------
    'Constructor for NX Styler class
    '------------------------------------------------------------------------------
    Public Sub New()
        Try
        
            theSession = Session.GetSession()
            theUI = UI.GetUI()
            theDlxFileName = "helloworld.dlx"
            theDialog = theUI.CreateDialog(theDlxFileName)
            theDialog.AddApplyHandler(AddressOf apply_cb)
            theDialog.AddOkHandler(AddressOf ok_cb)
            theDialog.AddUpdateHandler(AddressOf update_cb)
            theDialog.AddInitializeHandler(AddressOf initialize_cb)
            theDialog.AddDialogShownHandler(AddressOf dialogShown_cb)
        
        Catch ex As Exception
        
            '---- Enter your exception handling code here -----
            Throw ex
        End Try
    End Sub
#End Region
    
    '------------------------------- DIALOG LAUNCHING ---------------------------------
    '
    '    Before invoking this application one needs to open any part/empty part in NX
    '    because of the behavior of the blocks.
    '
    '    Make sure the dlx file is in one of the following locations:
    '        1.) From where NX session is launched
    '        2.) $UGII_USER_DIR/application
    '        3.) For released applications, using UGII_CUSTOM_DIRECTORY_FILE is highly
    '            recommended. This variable is set to a full directory path to a file 
    '            containing a list of root directories for all custom applications.
    '            e.g., UGII_CUSTOM_DIRECTORY_FILE=$UGII_BASE_DIR\ugii\menus\custom_dirs.dat
    '
    '    You can create the dialog using one of the following way:
    '
    '    1. Journal Replay
    '
    '        1) Replay this file through Tool->Journal->Play Menu.
    '
    '    2. USER EXIT
    '
    '        1) Create the Shared Library -- Refer "Block UI Styler programmer's guide"
    '        2) Invoke the Shared Library through File->Execute->NX Open menu.
    '
    '------------------------------------------------------------------------------
    Public Shared Sub Main()
        Dim thehelloworld As helloworld = Nothing
        Try
        
            thehelloworld = New helloworld()
            ' The following method shows the dialog immediately
            thehelloworld.Show()
        
        Catch ex As Exception
        
            '---- Enter your exception handling code here -----
            theUI.NXMessageBox.Show("Block Styler", NXMessageBox.DialogType.Error, ex.ToString)
        Finally
            If thehelloworld IsNot Nothing Then 
                thehelloworld.Dispose()
                thehelloworld = Nothing
            End If
        End Try
    End Sub
    '------------------------------------------------------------------------------
    ' This method specifies how a shared image is unloaded from memory
    ' within NX. This method gives you the capability to unload an
    ' internal NX Open application or user  exit from NX. Specify any
    ' one of the three constants as a return value to determine the type
    ' of unload to perform:
    '
    '
    '    Immediately : unload the library as soon as the automation program has completed
    '    Explicitly  : unload the library from the "Unload Shared Image" dialog
    '    AtTermination : unload the library when the NX session terminates
    '
    '
    ' NOTE:  A program which associates NX Open applications with the menubar
    ' MUST NOT use this option since it will UNLOAD your NX Open application image
    ' from the menubar.
    '------------------------------------------------------------------------------
    Public Shared Function GetUnloadOption(ByVal arg As String) As Integer
        'Return CType(Session.LibraryUnloadOption.Explicitly, Integer)
         Return CType(Session.LibraryUnloadOption.Immediately, Integer)
        ' Return CType(Session.LibraryUnloadOption.AtTermination, Integer)
    End Function
    '------------------------------------------------------------------------------
    ' Following method cleanup any housekeeping chores that may be needed.
    ' This method is automatically called by NX.
    '------------------------------------------------------------------------------
    Public Shared Sub UnloadLibrary(ByVal arg As String)
        Try
        
        
        Catch ex As Exception
        
            '---- Enter your exception handling code here -----
            theUI.NXMessageBox.Show("Block Styler", NXMessageBox.DialogType.Error, ex.ToString)
        End Try
    End Sub
    
    '------------------------------------------------------------------------------
    'This method shows the dialog on the screen
    '------------------------------------------------------------------------------
    Public Sub Show()
        Try
        
            theDialog.Show
        
        Catch ex As Exception
        
            '---- Enter your exception handling code here -----
            theUI.NXMessageBox.Show("Block Styler", NXMessageBox.DialogType.Error, ex.ToString)
        End Try
    End Sub
    
    '------------------------------------------------------------------------------
    'Method Name: Dispose
    '------------------------------------------------------------------------------
    Public Sub Dispose()
        If theDialog IsNot Nothing Then 
            theDialog.Dispose()
            theDialog = Nothing
        End If
    End Sub
    
    '------------------------------------------------------------------------------
    '---------------------Block UI Styler Callback Functions--------------------------
    '------------------------------------------------------------------------------
    
    '------------------------------------------------------------------------------
    'Callback Name: initialize_cb
    '------------------------------------------------------------------------------
    Public Sub initialize_cb()
        Try
        
            group0 = CType(theDialog.TopBlock.FindBlock("group0"), NXOpen.BlockStyler.Group)
            selection0 = CType(theDialog.TopBlock.FindBlock("selection0"), NXOpen.BlockStyler.SelectObject)
            colorPicker0 = CType(theDialog.TopBlock.FindBlock("colorPicker0"), NXOpen.BlockStyler.ObjectColorPicker)
        
        Catch ex As Exception
            ' Add the following line to pick only faces
            selection0.AddFilter(NXOpen.BlockStyler.SelectObject.FilterType.Faces)
            '---- Enter your exception handling code here -----
            theUI.NXMessageBox.Show("Block Styler", NXMessageBox.DialogType.Error, ex.ToString)
        End Try
    End Sub
    
    '------------------------------------------------------------------------------
    'Callback Name: dialogShown_cb
    'This callback is executed just before the dialog launch. Thus any value set 
    'here will take precedence and dialog will be launched showing that value. 
    '------------------------------------------------------------------------------
    Public Sub dialogShown_cb()
        Try
        
            '---- Enter your callback code here -----
             'Get the display modification object
            Dim selObjs As TaggedObject() = selection0.GetSelectedObjects()
            Dim dispMod = theSession.DisplayManager.NewDisplayModification()
            'Get the selected color
            Dim colors As Integer() = colorPicker0.GetValue()
            dispMod.NewColor = colors(0)
            'Get the selected faces
            Dim dispObjs As New System.Collections.Generic.List(Of DisplayableObject)
            For Each obj As TaggedObject In selObjs
                dispObjs.Add(CType(obj, Face))
            Next obj
            'Apply new color to faces
            dispMod.Apply(dispObjs.ToArray())
            dispMod.Dispose()
        
        Catch ex As Exception
        
            '---- Enter your exception handling code here -----
            theUI.NXMessageBox.Show("Block Styler", NXMessageBox.DialogType.Error, ex.ToString)
        End Try
    End Sub
    
    '------------------------------------------------------------------------------
    'Callback Name: apply_cb
    '------------------------------------------------------------------------------
    Public Function apply_cb() As Integer
        Dim errorCode as Integer = 0
        Try
        
            '---- Enter your callback code here -----
        
        Catch ex As Exception
        
            '---- Enter your exception handling code here -----
            errorCode = 1
            theUI.NXMessageBox.Show("Block Styler", NXMessageBox.DialogType.Error, ex.ToString)
        End Try
        apply_cb = errorCode
    End Function
    
    '------------------------------------------------------------------------------
    'Callback Name: update_cb
    '------------------------------------------------------------------------------
    Public Function update_cb(ByVal block As NXOpen.BlockStyler.UIBlock) As Integer
        Try
        
            If block Is selection0 Then
            '---- Enter your code here -----
            
            ElseIf block Is colorPicker0 Then
            '---- Enter your code here -----
            
            End If
        
        Catch ex As Exception
        
            '---- Enter your exception handling code here -----
            theUI.NXMessageBox.Show("Block Styler", NXMessageBox.DialogType.Error, ex.ToString)
        End Try
        update_cb = 0
    End Function
    
    '------------------------------------------------------------------------------
    'Callback Name: ok_cb
    '------------------------------------------------------------------------------
    Public Function ok_cb() As Integer
        Dim errorCode as Integer = 0
        Try
        
            '---- Enter your callback code here -----
            errorCode = apply_cb()
        
        Catch ex As Exception
        
            '---- Enter your exception handling code here -----
            errorCode = 1
            theUI.NXMessageBox.Show("Block Styler", NXMessageBox.DialogType.Error, ex.ToString)
        End Try
        ok_cb = errorCode
    End Function
    
    '------------------------------------------------------------------------------
    'Function Name: GetBlockProperties
    'Returns the propertylist of the specified BlockID
    '------------------------------------------------------------------------------
    Public Function GetBlockProperties(ByVal blockID As String) As PropertyList
        GetBlockProperties = Nothing
        Try
        
            GetBlockProperties = theDialog.GetBlockProperties(blockID)
        
        Catch ex As Exception
        
            '---- Enter your exception handling code here -----
            theUI.NXMessageBox.Show("Block Styler", NXMessageBox.DialogType.Error, ex.ToString)
        End Try
    End Function
    
End Class
