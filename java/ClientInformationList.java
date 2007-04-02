package llnl.visit;

import java.util.Vector;

// ****************************************************************************
// Class: ClientInformationList
//
// Purpose:
//    Contains the information for all connected clients.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Thu May 5 18:51:44 PST 2005
//
// Modifications:
//   
// ****************************************************************************

public class ClientInformationList extends AttributeSubject
{
    public ClientInformationList()
    {
        super(1);

        clients = new Vector();
    }

    public ClientInformationList(ClientInformationList obj)
    {
        super(1);

        int i;

        // *** Copy the clients field ***
        clients = new Vector(obj.clients.size());
        for(i = 0; i < obj.clients.size(); ++i)
        {
            ClientInformation newObj = (ClientInformation)clients.elementAt(i);
            clients.addElement(new ClientInformation(newObj));
        }


        SelectAll();
    }

    public boolean equals(ClientInformationList obj)
    {
        int i;

        boolean clients_equal = (obj.clients.size() == clients.size());
        for(i = 0; (i < clients.size()) && clients_equal; ++i)
        {
            // Make references to ClientInformation from Object.
            ClientInformation clients1 = (ClientInformation)clients.elementAt(i);
            ClientInformation clients2 = (ClientInformation)obj.clients.elementAt(i);
            clients_equal = clients1.equals(clients2);
        }

        // Create the return value
        return (clients_equal);
    }

    // Property setting methods
    // Property getting methods
    public Vector GetClients() { return clients; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
        {
            buf.WriteInt(clients.size());
            for(int i = 0; i < clients.size(); ++i)
            {
                ClientInformation tmp = (ClientInformation)clients.elementAt(i);
                tmp.Write(buf);
            }
        }
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        buf.ReadByte();
        {
            int len = buf.ReadInt();
            clients.clear();
            for(int j = 0; j < len; ++j)
            {
                ClientInformation tmp = new ClientInformation();
                tmp.Read(buf);
                clients.addElement(tmp);
            }
        }
        Select(0);
    }

    // Attributegroup convenience methods
    public void AddClientInformation(ClientInformation obj)
    {
        clients.addElement(new ClientInformation(obj));
        Select(0);
    }

    public void ClearClientInformations()
    {
        clients.clear();
        Select(0);
    }

    public void RemoveClientInformation(int index)
    {
        if(index >= 0 && index < clients.size())
        {
            clients.remove(index);
            Select(0);
        }
    }

    public int GetNumClientInformations()
    {
        return clients.size();
    }

    public ClientInformation GetClientInformation(int i)
    {
        ClientInformation tmp = (ClientInformation)clients.elementAt(i);
        return tmp;
    }


    // Attributes
    private Vector clients; // vector of ClientInformation objects
}

