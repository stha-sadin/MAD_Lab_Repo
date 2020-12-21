Packagecom.example.exno2;

importandroid.content.Intent;
importandroid.support.v7.app.AppCompatActivity;
importandroid.os.Bundle;
importandroid.view.View;
importandroid.widget.ArrayAdapter;
importandroid.widget.Button;
importandroid.widget.EditText;
importandroid.widget.Spinner;

publicclassMainActivity extendsAppCompatActivity {

    //Defining the Views
    EditText e1,e2;
    Button bt;
    Spinner s;

    //Data for populating in Spinner
    String [] dept_array={"CSE","ECE","IT","Mech","Civil"};

    String name,reg,dept;

    @Override
protectedvoidonCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

        //Referring the Views
        e1= (EditText) findViewById(R.id.editText);
        e2= (EditText) findViewById(R.id.editText2);

bt= (Button) findViewById(R.id.button);

        s= (Spinner) findViewById(R.id.spinner);

        //Creating Adapter for Spinner for adapting the data from array to Spinner
        ArrayAdapter adapter= newArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,dept_array);
s.setAdapter(adapter);

        //Creating Listener for Button
bt.setOnClickListener(newView.OnClickListener() {
            @Override
publicvoidonClick(View v) {

                //Getting the Values from Views(Edittext & Spinner)
name=e1.getText().toString();
reg=e2.getText().toString();
dept=s.getSelectedItem().toString();

                //Intent For Navigating to Second Activity
                Intent i = newIntent(MainActivity.this,SecondActivity.class);

                //For Passing the Values to Second Activity
i.putExtra("name_key", name);
i.putExtra("reg_key",reg);
i.putExtra("dept_key", dept);

startActivity(i);

            }
        });
    }
}
