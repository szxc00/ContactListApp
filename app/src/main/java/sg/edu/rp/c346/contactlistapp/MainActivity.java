package sg.edu.rp.c346.contactlistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContacts;
    ArrayList<ContactItem> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContacts = findViewById(R.id.listViewContacts);

        alContactList = new ArrayList<>();
        ContactItem item1 = new ContactItem("Mary", 65, 65442334);
        ContactItem item2 = new ContactItem("Ken", 65, 97442437);
        alContactList.add(item1);
        alContactList.add(item2);

        caContact = new CustomAdapter(this, R.layout.contact_item, alContactList);

        lvContacts.setAdapter(caContact);
    }
}
