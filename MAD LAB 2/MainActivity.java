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

   
    EditText e1,e2;
    Button bt;
    Spinner s;

    
    String [] dept_array={"CSE","ECE","IT","Mech","Civil"};

    String name,reg,dept;

    @Override
protectedvoidonCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

       
        e1= (EditText) findViewById(R.id.editText);
        e2= (EditText) findViewById(R.id.editText2);

bt= (Button) findViewById(R.id.button);

        s= (Spinner) findViewById(R.id.spinner);

       
        ArrayAdapter adapter= newArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,dept_array);
s.setAdapter(adapter);

        
bt.setOnClickListener(newView.OnClickListener() {
            @Override
publicvoidonClick(View v) {

                
name=e1.getText().toString();
reg=e2.getText().toString();
dept=s.getSelectedItem().toString();

                Intent i = newIntent(MainActivity.this,SecondActivity.class);

            
i.putExtra("name_key", name);
i.putExtra("reg_key",reg);
i.putExtra("dept_key", dept);

startActivity(i);

            }
        });
    }
}
