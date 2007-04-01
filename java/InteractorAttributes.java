package llnl.visit;


// ****************************************************************************
// Class: InteractorAttributes
//
// Purpose:
//    This class contains attributes associated with the main window.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Mon Dec 27 11:27:58 PDT 2004
//
// Modifications:
//   
// ****************************************************************************

public class InteractorAttributes extends AttributeSubject
{
    // Enum values
    public final static int NAVIGATIONMODE_TRACKBALL = 0;
    public final static int NAVIGATIONMODE_DOLLY = 1;
    public final static int NAVIGATIONMODE_FLYTHROUGH = 2;


    public InteractorAttributes()
    {
        super(4);

        showGuidelines = true;
        clampSquare = false;
        fillViewportOnZoom = true;
        navigationMode = NAVIGATIONMODE_TRACKBALL;
    }

    public InteractorAttributes(InteractorAttributes obj)
    {
        super(4);

        showGuidelines = obj.showGuidelines;
        clampSquare = obj.clampSquare;
        fillViewportOnZoom = obj.fillViewportOnZoom;
        navigationMode = obj.navigationMode;

        SelectAll();
    }

    public boolean equals(InteractorAttributes obj)
    {
        // Create the return value
        return ((showGuidelines == obj.showGuidelines) &&
                (clampSquare == obj.clampSquare) &&
                (fillViewportOnZoom == obj.fillViewportOnZoom) &&
                (navigationMode == obj.navigationMode));
    }

    // Property setting methods
    public void SetShowGuidelines(boolean showGuidelines_)
    {
        showGuidelines = showGuidelines_;
        Select(0);
    }

    public void SetClampSquare(boolean clampSquare_)
    {
        clampSquare = clampSquare_;
        Select(1);
    }

    public void SetFillViewportOnZoom(boolean fillViewportOnZoom_)
    {
        fillViewportOnZoom = fillViewportOnZoom_;
        Select(2);
    }

    public void SetNavigationMode(int navigationMode_)
    {
        navigationMode = navigationMode_;
        Select(3);
    }

    // Property getting methods
    public boolean GetShowGuidelines() { return showGuidelines; }
    public boolean GetClampSquare() { return clampSquare; }
    public boolean GetFillViewportOnZoom() { return fillViewportOnZoom; }
    public int     GetNavigationMode() { return navigationMode; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteBool(showGuidelines);
        if(WriteSelect(1, buf))
            buf.WriteBool(clampSquare);
        if(WriteSelect(2, buf))
            buf.WriteBool(fillViewportOnZoom);
        if(WriteSelect(3, buf))
            buf.WriteInt(navigationMode);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetShowGuidelines(buf.ReadBool());
                break;
            case 1:
                SetClampSquare(buf.ReadBool());
                break;
            case 2:
                SetFillViewportOnZoom(buf.ReadBool());
                break;
            case 3:
                SetNavigationMode(buf.ReadInt());
                break;
            }
        }
    }


    // Attributes
    private boolean showGuidelines;
    private boolean clampSquare;
    private boolean fillViewportOnZoom;
    private int     navigationMode;
}

