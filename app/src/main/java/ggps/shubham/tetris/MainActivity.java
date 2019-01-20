package ggps.shubham.tetris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.a1);
        b=findViewById(R.id.a2);
        s=findViewById(R.id.a2b);
        c=findViewById(R.id.a3);
        d=findViewById(R.id.a4);
        e =findViewById(R.id.a5);
        f=findViewById(R.id.a6);
        g=findViewById(R.id.a7);
        h=findViewById(R.id.a8);
        i=findViewById(R.id.ab8);
        j=findViewById(R.id.a9);
        k=findViewById(R.id.a10);
        l=findViewById(R.id.a11);
        m=findViewById(R.id.a12);
        t=findViewById(R.id.a12b);
        n=findViewById(R.id.a13);
        o=findViewById(R.id.ab13);
        p=findViewById(R.id.a17);
        q=findViewById(R.id.a18);
        r=findViewById(R.id.a19);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
a.setImageResource(android.R.color.transparent);
                a.getLayoutParams().height=0;
                a.getLayoutParams().width=0;
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.setImageResource(android.R.color.transparent);
                s.getLayoutParams().height=0;
                s.getLayoutParams().width=0;
                b.setImageResource(android.R.color.transparent);
                b.getLayoutParams().height=0;
                b.getLayoutParams().width=0;
            }
        });
         b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.setImageResource(android.R.color.transparent);
                s.getLayoutParams().height=0;
                s.getLayoutParams().width=0;
                b.setImageResource(android.R.color.transparent);
                b.getLayoutParams().height=0;
                b.getLayoutParams().width=0;
            }
        });c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
c.setImageResource(android.R.color.transparent);
                c.getLayoutParams().height=0;
                c.getLayoutParams().width=0;
            }
        });d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
d.setImageResource(android.R.color.transparent);
                d.getLayoutParams().height=0;
                d.getLayoutParams().width=0;
            }
        });e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
e.setImageResource(android.R.color.transparent);
                e.getLayoutParams().height=0;
                e.getLayoutParams().width=0;
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
f.setImageResource(android.R.color.transparent);
                f.getLayoutParams().height=0;
                f.getLayoutParams().width=0;
            }
        });g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
g.setImageResource(android.R.color.transparent);
                g.getLayoutParams().height=0;
                g.getLayoutParams().width=0;
            }
        });h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
h.setImageResource(android.R.color.transparent);
                h.getLayoutParams().height=0;
                h.getLayoutParams().width=0;
            }
        });i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
i.setImageResource(android.R.color.transparent);
                i.getLayoutParams().height=0;
                i.getLayoutParams().width=0;
            }
        });j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
j.setImageResource(android.R.color.transparent);
                j.getLayoutParams().height=0;
                j.getLayoutParams().width=0;
            }
        });k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
k.setImageResource(android.R.color.transparent);
                k.getLayoutParams().height=0;
                k.getLayoutParams().width=0;
            }
        });l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
l.setImageResource(android.R.color.transparent);
                l.getLayoutParams().height=0;
                l.getLayoutParams().width=0;
            }
        });m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
m.setImageResource(android.R.color.transparent);
                m.getLayoutParams().height=0;
                m.getLayoutParams().width=0;
t.setImageResource(android.R.color.transparent);
                t.getLayoutParams().height=0;
                t.getLayoutParams().width=0;

            }
        });
t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
t.setImageResource(android.R.color.transparent);
                t.getLayoutParams().height=0;
                t.getLayoutParams().width=0;
m.setImageResource(android.R.color.transparent);
                m.getLayoutParams().height=0;
                m.getLayoutParams().width=0;

            }
        });
n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
n.setImageResource(android.R.color.transparent);
                n.getLayoutParams().height=0;
                n.getLayoutParams().width=0;
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
o.setImageResource(android.R.color.transparent);
                o.getLayoutParams().height=0;
                o.getLayoutParams().width=0;
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
p.setImageResource(android.R.color.transparent);
p.getLayoutParams().height=0;
                p.getLayoutParams().width=0;
            }
        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
q.setImageResource(android.R.color.transparent);
                q.getLayoutParams().height=0;
                q.getLayoutParams().width=0;
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
r.setImageResource(android.R.color.transparent);
                r.getLayoutParams().height=0;
                r.getLayoutParams().width=0;
            }
        });
            }
}
