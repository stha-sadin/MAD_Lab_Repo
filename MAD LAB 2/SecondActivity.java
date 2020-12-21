Packagecom.example.exno2;

importandroid.content.Intent;
importandroid.support.v7.app.AppCompatActivity;
importandroid.os.Bundle;
importandroid.widget.TextView;

publicclassSecondActivity extendsAppCompatActivity {

    TextView t1,t2,t3;

    String name,reg,dept;

    @Override
ProtectedvoidonCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_second);

        t1= (TextView) findViewById(R.id.textView1);
        t2= (TextView) findViewById(R.id.textView2);
        t3= (TextView) findViewById(R.id.textView3);

       
        Intent i = getIntent();

        
name=i.getStringExtra("name_key");
reg=i.getStringExtra("reg_key");
dept=i.getStringExtra("dept_key");

       
t1.setText(name);
t2.setText(reg);
t3.setText(dept);

    }
}
