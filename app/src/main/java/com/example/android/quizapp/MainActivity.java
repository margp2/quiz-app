package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Variable score defined
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        Button scoreButton = findViewById(R.id.scoreButton);
        scoreButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finalScore(true, true, true);
            }

        });

    }

    //Calling the final score button method
    public void finalScore(boolean germanyWoman, boolean banglaWoman, boolean englishWoman) {
        Log.w("Margi", "reached final score ");

        TextView scoreTextView = findViewById(R.id.yourTotalScoreIs);
        scoreTextView.setText("7");
        //Calling the radio button for denmark PM
        RadioButton yesHelTho = findViewById ( R.id.helleThorn );
        boolean sheIsHelTho = yesHelTho.isChecked ();
        //Calling the radio button for Theresa May
        RadioButton noTheMay = findViewById ( R.id.theresaMay );
        boolean sheIsNotHelTho = noTheMay.isChecked ();

        int totalScore = calculatePmScore ( sheIsHelTho );

        String message = finalTotalScore ( totalScore, sheIsHelTho, germanyWoman, banglaWoman, englishWoman );

        //Get the capital of Brazil
        EditText capitalField = findViewById ( R.id.capital );
        Editable capitalEditable = capitalField.getText ();
        String capital = capitalEditable.toString ();

        //Calling the Germany leader
        CheckBox yesGerman = findViewById ( R.id.germany );
        boolean germanAngela = yesGerman.isChecked ();
        //Calling the United States leader
        CheckBox noTheUS = findViewById ( R.id.theStates );
        boolean noUsWomenLea = noTheUS.isChecked ();
        //Calling the Bangladesh leader
        CheckBox yesBangla = findViewById ( R.id.bangla );
        boolean bengaliWoman = yesBangla.isChecked ();
        //Calling the England leader
        CheckBox yesEngland = findViewById ( R.id.englandMay );
        boolean engMay = yesEngland.isChecked ();

        //Calling the constitutional monarchy method
        RadioButton constitutionalMon = findViewById ( R.id.constMon );
        boolean yesConstMon = constitutionalMon.isChecked ();
        //Calling the constitutional federal republic
        RadioButton constitutionalFedRep = findViewById ( R.id.constFedRep );
        boolean conFedRep = constitutionalFedRep.isChecked ();

        //Calling the world war II sep 2, 1945 method
        RadioButton worldWarIISep = findViewById ( R.id.sep2 );
        boolean septSecond = worldWarIISep.isChecked ();
        //Calling the world ar II aug 18, 1918
        RadioButton worldWarIIAug = findViewById ( R.id.aug18 );
        boolean augEighteenth = worldWarIIAug.isChecked ();

        //Calling the Africa true radio button
        RadioButton chooseAfricaCorrect = findViewById ( R.id.afCountT );
        boolean africaContinent = chooseAfricaCorrect.isChecked ();
        //Calling the Africa False radio button method
        RadioButton chooseAfricaNotCorrect = findViewById ( R.id.afCountF );
        boolean africaCountry = chooseAfricaNotCorrect.isChecked ();

        //Calling the madras silk road checkbox method
        CheckBox cityMadras = findViewById ( R.id.silkMadras );
        boolean madrasCity = cityMadras.isChecked ();
        //Calling the Baku silk road checkbox method
        CheckBox cityBaku = findViewById ( R.id.silkBaku );
        boolean bakuCity = cityBaku.isChecked ();
        //Calling Denver not a silk road city
        CheckBox cityDenver = findViewById ( R.id.silkDen );
        boolean denverCity = cityDenver.isChecked ();

        //Calling opec EditText method
        EditText orgPetrol = findViewById ( R.id.opecOrg );
        Editable petrolOrgEditable = orgPetrol.getText ();
        String orgnizationOfPetrol = petrolOrgEditable.toString ();

        //Calling mexico EditText method
        EditText mexSpan = findViewById ( R.id.mexLanAns );
        Editable spanMexEditable = mexSpan.getText ();
        String spanishMexico = spanMexEditable.toString ();

        //Calling the Radio button for Nafta Countries one
        RadioButton chilArgPer = findViewById ( R.id.naftaCountriesOne );
        boolean perArgChil = chilArgPer.isChecked ();

        //Calling the radio button for Nafta countries two
        RadioButton uScAmX = findViewById ( R.id.naftaCountriesTwo );
        boolean mXcAuS = uScAmX.isChecked ();

        //Calling the radio button for Nafta countries three
        RadioButton uScAuK = findViewById ( R.id.naftaCountriesThree );
        boolean uKcAuS = uScAuK.isChecked ();

        //Calling the bonus soft power edit text method
        EditText softPower = findViewById ( R.id.softPowerAns );
        Editable softPowerEditable = softPower.getText ();
        String softPowerImpt = softPowerEditable.toString ();
    }
    //@param helleThorn awards one point for being the correct.
    //@param theresaMay awards 0 point for being the incorrect answer.
    //@return the correct score

    private int calculatePmScore(boolean helleThorn) {
        //Creating control flow statements for getting the correct score
        //initial score of 1 correct answer
        int oneCorrectAnswer = 0;
        //Award one point for the right answer
        if (helleThorn) {
            oneCorrectAnswer = oneCorrectAnswer + 1;
        } else if (!helleThorn) {
            oneCorrectAnswer = oneCorrectAnswer;
        }
        return score + oneCorrectAnswer;
    }

    //Calling the calculate Brazil capital score method
    private int calculateBrazilCapScore(boolean brasilia) {
        int rightAnswer = 1;
        if (brasilia) {
            rightAnswer = 1;
        }
        return score + rightAnswer;
    }

    //Calling the caclulat women leader score method
    private int calculateWomenLeaderScore(boolean germanyWoman, boolean banglaWoman, boolean englishWoman) {
        int theRightAnswer = 0;
        if (germanyWoman && banglaWoman && englishWoman) {
            theRightAnswer = theRightAnswer + 1;
        } else if (!germanyWoman && banglaWoman && englishWoman) {
            theRightAnswer = theRightAnswer;
        }
        return score + theRightAnswer;
    }

    //Calling the calculate england government score method
    private int calculateEnglishGovScore(boolean constituionalMonarchy) {
        int theCorrectAnswer = 0;
        if (constituionalMonarchy) {
            theCorrectAnswer = theCorrectAnswer + 1;
        } else if (!constituionalMonarchy) {
            theCorrectAnswer = theCorrectAnswer;
        }
        return score + theCorrectAnswer;
    }

    //Creating a total calculate WWII score method
    private int calculateWorldWar2Score(boolean sep21945) {
        int theCorrectAnswer = 0;
        if (sep21945) {
            theCorrectAnswer = theCorrectAnswer + 1;
        } else if (!sep21945) {
            theCorrectAnswer = theCorrectAnswer;
        }
        return score + theCorrectAnswer;
    }

    //Calling the calculate Africa score method
    private int calculateAfricaScore() {
        int theCorrectAnswer = 0;
        if (false) {
            theCorrectAnswer = theCorrectAnswer + 1;
        } else if (!false) {
            theCorrectAnswer = theCorrectAnswer;
        }
        return score + theCorrectAnswer;
    }

    //Calculate silk road cities score method
    private int calculateSilkRoadCity(boolean madCity, boolean bakuIsAcity) {
        int theCorrectAnswer = 0;
        if (madCity && bakuIsAcity) {
            theCorrectAnswer = theCorrectAnswer + 1;
        } else if (!madCity && bakuIsAcity) {
            theCorrectAnswer = theCorrectAnswer;
        }
        return score + theCorrectAnswer;
    }

    //Calculate the score for OPEC
    private int calculateOpecScore(boolean organizationOfPetrol) {
        int theCorrectAnswer = 0;
        if (organizationOfPetrol) {
            theCorrectAnswer = theCorrectAnswer + 1;
        } else if (!organizationOfPetrol) {
            theCorrectAnswer = theCorrectAnswer;
        }
        return score + theCorrectAnswer;
    }

    //Calling the Mexico score method
    private int calculateMexScore(boolean spanish) {
        int theCorrectAnswer = 0;
        if (spanish) {
            theCorrectAnswer = theCorrectAnswer + 1;
        } else if (!spanish) {
            theCorrectAnswer = theCorrectAnswer;
        }
        return score + theCorrectAnswer;
    }

    //Calling the nafta countries score method
    private int calculateNaftaScore(boolean unitedStates, boolean canada, boolean mexico) {
        int theCorrectAnswer = 0;
        if (unitedStates && canada && mexico) {
            theCorrectAnswer = theCorrectAnswer + 1;
        } else if (!unitedStates && canada && mexico) {
            theCorrectAnswer = theCorrectAnswer;
        }
        return score + theCorrectAnswer;
    }

    //Calling the soft power method
    private int calculateSoftScore(boolean diplomacy) {
        int theCorrectAnswer = 0;
        if (diplomacy) {
            theCorrectAnswer = theCorrectAnswer + 1;
        } else if (!diplomacy) {
            theCorrectAnswer = theCorrectAnswer;
        }
        return score + theCorrectAnswer;
    }

    //Figure out the total score from all the questions
    //@param score of the order
    //@param yesHelTho
    //@param noTheMay
    private String finalTotalScore(int totalScore, boolean hellThorn, boolean germanyWoman, boolean banglaWoman, boolean englishWoman) {
        String scoreMessage = "\nHere is your final score" + hellThorn;
        scoreMessage += String.valueOf ( germanyWoman && banglaWoman && englishWoman );
        return scoreMessage;
    }

    //Displays the total score
    private void displayTotalScore(int theTotalScore) {
        TextView yourTotalScoreIs = findViewById ( R.id.yourTotalScoreIs );
        yourTotalScoreIs.setText ( theTotalScore );
    }
}