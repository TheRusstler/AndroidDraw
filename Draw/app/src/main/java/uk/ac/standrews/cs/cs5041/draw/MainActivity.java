package uk.ac.standrews.cs.cs5041.draw;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends ActionBarActivity {

    DrawingPane board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        board = new DrawingPane(this);
        setContentView(R.layout.activity_main);
        RelativeLayout l = (RelativeLayout)findViewById(R.id.drawingLayout);
        l.addView(board);
    }

    public void clear(View view) {
        board.clear();
    }

    public void newLine(View view) {
        board.setMode(DrawingMode.Draw);
        board.setCurrentShape(CurrentShape.Line);
    }

    public void move(View view) {
        board.setMode(DrawingMode.Move);
    }
}
