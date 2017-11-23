package calc.com.davidetruong.tcalculator;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;
import butterknife.OnTouch;

/**
 * @author davidetruong
 * @version 1.0
 * @see MainActivity
 * @since 21 November 2017
 * My main activity using ButterKnife to show a simple example in Android development app.
 * Nothing special, enjoy.
 */
public class MainActivity extends Activity {

    @BindView(R.id.btn_one)
    Button btn_one;
    @BindView(R.id.btn_two)
    Button btn_two;
    @BindView(R.id.btn_three)
    Button btn_three;
    @BindView(R.id.btn_four)
    Button btn_four;
    @BindView(R.id.btn_five)
    Button btn_five;
    @BindView(R.id.btn_six)
    Button btn_six;
    @BindView(R.id.btn_seven)
    Button btn_seven;
    @BindView(R.id.btn_eight)
    Button btn_eight;
    @BindView(R.id.btn_nine)
    Button btn_nine;
    @BindView(R.id.btn_zero)
    Button btn_zero;
    @BindView(R.id.btn_clear)
    Button btn_clear;
    @BindView(R.id.btn_dot)
    Button btn_dot;
    @BindView(R.id.btn_dash)
    Button btn_dash;
    @BindView(R.id.btn_multi)
    Button btn_multi;
    @BindView(R.id.btn_minus)
    Button btn_minus;
    @BindView(R.id.btn_plus)
    Button btn_plus;
    @BindView(R.id.btn_equal)
    Button btn_equal;
    @BindView(R.id.tv_result)
    TextView tv_result;

    private String runningNumber;
    private String leftNumber;
    private String rightNumber;
    private Operator currentOperator;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    /**
     * Method just for fun
     */
    private void init() {
        String tv_init = "";
        runningNumber = "";
        tv_result.setText(tv_init);
    }

    /**
     * Function to describe on click event in button One
     */
    @OnClick(R.id.btn_one)
    public void pressedOne() {
        numberPressed("1");
    }

    @OnClick(R.id.btn_two)
    public void pressedTwo() {
        numberPressed("2");
    }

    @OnClick(R.id.btn_three)
    public void pressedThree() {
        numberPressed("3");
    }

    @OnClick(R.id.btn_four)
    public void pressedOFour() {
        numberPressed("4");
    }

    @OnClick(R.id.btn_five)
    public void pressedFive() {
        numberPressed("5");
    }

    @OnClick(R.id.btn_six)
    public void pressedSix() {
        numberPressed("6");
    }

    @OnClick(R.id.btn_seven)
    public void pressedSeven() {
        numberPressed("7");
    }

    @OnClick(R.id.btn_eight)
    public void pressedEight() {
        numberPressed("8");
    }

    @OnClick(R.id.btn_nine)
    public void pressedNine() {
        numberPressed("9");
    }

    @OnClick(R.id.btn_zero)
    public void pressedOZero() {
        numberPressed("0");
    }

    @OnClick(R.id.btn_dot)
    public void pressedDot() {
        if (!runningNumber.contains("."))
            numberPressed(".");
    }

    @OnClick(R.id.btn_clear)
    public void pressedClear() {
        if (!runningNumber.equals("")) {
            runningNumber = runningNumber.substring(0, runningNumber.length() - 1);
            Log.d("#", "Running number value: " + runningNumber);
            tv_result.setText(runningNumber);
        }
    }

    @OnLongClick(R.id.btn_clear)
    public boolean holdClear() {
        tv_result.setText("");
        return true;
    }

    /**
     * To catch the number button
     *
     * @param number
     */
    private void numberPressed(String number) {
        runningNumber += number;
        tv_result.setText(runningNumber);
    }

    private void processOperator(Operator operator) {
        if (currentOperator != null) {
            if (!rightNumber.equals("")) {
                rightNumber = runningNumber;

            }
        } else {
            leftNumber = runningNumber;
            runningNumber = "";
        }
    }
}
