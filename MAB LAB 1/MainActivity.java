packagecom.example.exno1;

importandroid.graphics.Color;
importandroid.support.v7.app.AppCompatActivity;
importandroid.os.Bundle;
importandroid.view.View;
importandroid.widget.Button;
importandroid.widget.TextView;

publicclassMainActivity extendsAppCompatActivity
{
intch=1;
floatfont=30;
    @Override
ProtectedvoidonCreate(Bundle savedInstanceState)
    {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
finalTextView t= (TextView) findViewById(R.id.textView);
        Button b1= (Button) findViewById(R.id.button1);
b1.setOnClickListener(newView.OnClickListener() {
            @Override
PublicvoidonClick(View v) {
t.setTextSize(font);
font = font + 5;
if(font == 50)
font = 30;
            }
        });
        Button b2= (Button) findViewById(R.id.button2);
b2.setOnClickListener(newView.OnClickListener() {
            @Override
PublicvoidonClick(View v) {
switch(ch) {
                    case1:
t.setTextColor(Color.RED);
break;
                    case2:
t.setTextColor(Color.GREEN);
break;
                    case3:
t.setTextColor(Color.BLUE);
break;
                    case4:
t.setTextColor(Color.CYAN);
break;
                    case5:
t.setTextColor(Color.YELLOW);
break;
                    case6:
t.setTextColor(Color.MAGENTA);
break;
                }
ch++;
if(ch == 7)
ch = 1;
            }
        });
    }
}
