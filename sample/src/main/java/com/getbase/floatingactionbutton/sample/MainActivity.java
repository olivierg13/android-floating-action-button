package com.getbase.floatingactionbutton.sample;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.pink_icon).setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Clicked pink Floating Action Button", Toast.LENGTH_SHORT).show();
      }
    });

    FloatingActionButton button = (FloatingActionButton) findViewById(R.id.setter);
    button.setSize(FloatingActionButton.SIZE_MINI);
    button.setColorNormalResId(R.color.pink);
    button.setColorPressedResId(R.color.pink_pressed);
    button.setIcon(R.drawable.ic_fab_star);

      FloatingActionsMenu floatingActionsMenu = (FloatingActionsMenu) findViewById(R.id.multiple_actions_left);
      floatingActionsMenu.setRotationAnimatorListener(new Animator.AnimatorListener() {
          @Override
          public void onAnimationStart(Animator animation) {
          }

          @Override
          public void onAnimationEnd(Animator animation) {
              test();
          }

          @Override
          public void onAnimationCancel(Animator animation) {
          }

          @Override
          public void onAnimationRepeat(Animator animation) {
          }
      });
  }
    private void test() {
        Toast.makeText(this, "Button animated", Toast.LENGTH_SHORT).show();
    }
}
