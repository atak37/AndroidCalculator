package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView entry;
    TextView equation;

    //these strings will help with equation section and history
    String signInput;
    String firstInput;
    String secondInput;

    //thesee values will help with finding the result (Double since decimals and % is a factor)
    Double firstValue, secondValue, endValue;

    //boolean flag for decimal if true or not, I don't want user to be able to put in numerous .'s
    boolean decimalFlag = false;

    //boolean flag for finished solution if true or not, i want user to be
    // albe to click on a new number after solution to start a new equation
    boolean finishedFlag = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //content activty_main xml will be opened
        setContentView(R.layout.activity_main);
        entry = (TextView) findViewById(R.id.entry);
        equation = (TextView) findViewById(R.id.equationHint);
    }


    //******Starting method calls for 0-9 (this is only for equation line functionality)
    public void clickedZero(View view){
        //set text of entry as 0
        if (finishedFlag == true){
            entry.setText(null);
            equation.setText(null);
            finishedFlag = false;
            decimalFlag = false;
        }
        entry.setText(entry.getText() + "0");
    }
    public void clickedOne(View view){
        //set text of entry as 1
        if (finishedFlag == true){
            entry.setText(null);
            equation.setText(null);
            finishedFlag = false;
            decimalFlag = false;
        }
        entry.setText(entry.getText() + "1");
    }
    public void clickedTwo(View view){
        //set text of entry as 2
        if (finishedFlag == true){
            entry.setText(null);
            equation.setText(null);
            finishedFlag = false;
            decimalFlag = false;
        }
        entry.setText(entry.getText() + "2");
    }
    public void clickedThree(View view){
        //set text of entry as 3
        if (finishedFlag == true){
            entry.setText(null);
            equation.setText(null);
            finishedFlag = false;
            decimalFlag = false;
        }
        entry.setText(entry.getText() + "3");
    }
    public void clickedFour(View view){
        //set text of entry as 4
        if (finishedFlag == true){
            entry.setText(null);
            equation.setText(null);
            finishedFlag = false;
            decimalFlag = false;
        }
        entry.setText(entry.getText() + "4");
    }
    public void clickedFive(View view){
        //set text of entry as 5
        if (finishedFlag == true){
            entry.setText(null);
            equation.setText(null);
            finishedFlag = false;
            decimalFlag = false;
        }
        entry.setText(entry.getText() + "5");
    }
    public void clickedSix(View view){
        //set text of entry as 6
        if (finishedFlag == true){
            entry.setText(null);
            equation.setText(null);
            finishedFlag = false;
            decimalFlag = false;
        }
        entry.setText(entry.getText() + "6");
    }
    public void clickedSeven(View view){
        //set text of entry as 7
        if (finishedFlag == true){
            entry.setText(null);
            equation.setText(null);
            finishedFlag = false;
            decimalFlag = false;
        }
        entry.setText(entry.getText() + "7");
    }
    public void clickedEight(View view){
        //set text of entry as 8
        if (finishedFlag == true){
            entry.setText(null);
            equation.setText(null);
            finishedFlag = false;
            decimalFlag = false;
        }
        entry.setText(entry.getText() + "8");
    }
    public void clickedNine(View view){
        //set text of entry as 9
        if (finishedFlag == true){
            entry.setText(null);
            equation.setText(null);
            finishedFlag = false;
            decimalFlag = false;
        }
        entry.setText(entry.getText() + "9");
    }

    //******Starting method calls for +.-.x.÷ (this is only for equation line functionality)
    public void clickedAdd(View view){
        //sets the sign as + (note it is a String)
        signInput = "+";
        //the entry put in prior to pushing + sign will now be set as string firstInput
        firstInput = entry.getText().toString();
        //this will now set the entry prior to + sign as null (After storing)
        entry.setText(null);
        //now put it into the equation line with firstInput and + sign
        equation.setText(firstInput + " + ");
        //now we wait for second input and equal sign which will be implemented in clickedEqual method
    }
    public void clickedSubtract(View view){
        signInput = "-";
        firstInput = entry.getText().toString();
        entry.setText(null);
        equation.setText(firstInput + " - ");
    }
    public void clickedMultiply(View view){
        signInput = "x";
        firstInput = entry.getText().toString();
        entry.setText(null);
        equation.setText(firstInput + " x ");
    }
    public void clickedDivide(View view){
        signInput = "÷";
        firstInput = entry.getText().toString();
        entry.setText(null);
        equation.setText(firstInput + " ÷ ");
    }

    //*****Starting method calls for top row of calculator buttons (this is only for equation line)
    public void clickedPercent(View view){
        signInput = "%";
        firstInput = entry.getText().toString();
        Double firstValueTemp = Double.parseDouble(firstInput);
        Double endValueTemp = firstValueTemp/100;
        String endValueTempString = String.valueOf(endValueTemp);
        entry.setText(endValueTempString);
        equation.setText(endValueTempString);
    }
    public void clickedSquareRoot(View view){
        signInput = "√";
        firstInput = entry.getText().toString();
        Double firstValueTemp = Double.parseDouble(firstInput);
        Double endValueTemp = Math.sqrt(firstValueTemp);
        String endValueTempString = String.valueOf(endValueTemp);
        entry.setText(endValueTempString);
        equation.setText("√(" + firstInput +")");
    }
    public void clickedSquared(View view){
        signInput = "squared";
        firstInput = entry.getText().toString();
        Double firstValueTemp = Double.parseDouble(firstInput);
        Double endValueTemp = firstValueTemp * firstValueTemp;
        String endValueTempString = String.valueOf(endValueTemp);
        entry.setText(endValueTempString);
        equation.setText("sqr(" + firstInput + ")");

    }
    public void clickedDivideByX(View view){
        signInput = "1/x";
        firstInput = entry.getText().toString();
        Double firstValueTemp = Double.parseDouble(firstInput);
        Double endValueTemp = 1/firstValueTemp;
        String endValueTempString = String.valueOf(endValueTemp);
        entry.setText(endValueTempString);
        equation.setText("(1/" + firstInput + ")");
    }
    // +/- button
    public void clickedPlusMinus(View view){
        if(entry.getText().equals("")){
            entry.setText("0");
        }else {
            signInput = "+/-";
            firstInput = entry.getText().toString();
            Double firstValueTemp = Double.parseDouble(firstInput);
            Double endValueTemp = (-1 * firstValueTemp);
            String endValueTempString = String.valueOf(endValueTemp);
            entry.setText(endValueTempString);
            equation.setText("negate(" + firstInput + ")");
        }
    }

    // . button
    public void clickedDecimal(View view){
        signInput = ".";
        if (decimalFlag == false){
            if(entry.getText().equals("")) {
                entry.setText("0.");
            }else{
                entry.setText(entry.getText() + ".");
            }
            decimalFlag = true;
            equation.setText("");
        }

    }

    //backspace button
    public void clickedDelete(View view){
        if (entry.getText().equals("")){
            entry.setText("");
        }else{

        }
    }
    // CE clear entry button, clears the most recent entry
    public void clickedClearEntry(View view){
        decimalFlag = false;
        entry.setText(null);
    }

    // C clear all the calculator (set all values = to null and decimal flag to false)
    public void clickedClear(View view){
        decimalFlag = false;
        entry.setText(null);
        equation.setText(null);
        firstInput = null;
        secondInput = null;
        signInput = null;
    }

    //*****main logic of calculator, method call for when = sign is clicked
    public void clickedEqual(View view){
        //this if case states if nothing was called before the equal sign
        if (signInput == null){
            equation.setText("No action was clicked");
        }else if(entry.getText().equals("")){
            equation.setText("No second input");
        }
        //this should be the accepted state when everything was clicked correctly in the appropriate order
        else{
            finishedFlag = true;
            decimalFlag = true;
            //run this with a switch case using signInput as value
            switch(signInput){
                default:break;
                case "+":
                    secondInput = entry.getText().toString();
                    firstValue = Double.parseDouble(firstInput);
                    secondValue = Double.parseDouble(secondInput);
                    endValue = firstValue + secondValue;
                    entry.setText(endValue + "");
                    signInput = null;
                    equation.setText(firstInput + " + " + secondInput + "=");
                    break;
                case "-":
                    secondInput = entry.getText().toString();
                    firstValue = Double.parseDouble(firstInput);
                    secondValue = Double.parseDouble(secondInput);
                    endValue = firstValue - secondValue;
                    entry.setText(endValue + "");
                    signInput = null;
                    equation.setText(firstInput + " - " + secondInput + "=");
                    break;
                case "x":
                    secondInput = entry.getText().toString();
                    firstValue = Double.parseDouble(firstInput);
                    secondValue = Double.parseDouble(secondInput);
                    endValue = firstValue * secondValue;
                    entry.setText(endValue + "");
                    signInput = null;
                    equation.setText(firstInput + " x " + secondInput + "=");
                    break;
                case "÷":
                    secondInput = entry.getText().toString();
                    firstValue = Double.parseDouble(firstInput);
                    secondValue = Double.parseDouble(secondInput);
                    endValue = firstValue / secondValue;
                    entry.setText(endValue + "");
                    signInput = null;
                    equation.setText(firstInput + " ÷ " + secondInput + "=");
                    break;
                case "squared":
                    firstValue = Double.parseDouble(firstInput);
                    endValue = firstValue * firstValue;
                    entry.setText(endValue + "");
                    signInput = null;
                    equation.setText(firstInput + "√(" + firstInput + ")");
                    break;
            }
        }
    }


}
