package info.camposha.singlechoicerecyclerview_vela;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailsActivity extends AppCompatActivity {

  TextView nameTxt, descTxt, dateDetailTextView;
  ImageView galaxyImg;

  //We start by initializing our widgets.
  private void initializeWidgets() {
    nameTxt = findViewById(R.id.nameTxt);
    descTxt = findViewById(R.id.descTxt);
    dateDetailTextView = findViewById(R.id.dateDetailTextView);
    descTxt = findViewById(R.id.descTxt);
    galaxyImg = findViewById(R.id.galaxyImg);
  }

  //This method will get todays date and return it as a string
  private String getDateToday() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date date = new Date();
    String today = dateFormat.format(date);
    return today;
  }

  //I'll create a method to receive and show data.
  private void receiveAndShowData() {
    //RECEIVE DATA FROM ITEMS ACTIVITY VIA INTENT
    Intent i = this.getIntent();
    Galaxy g= (Galaxy) i.getSerializableExtra("GALAXY_KEY");

    //SET RECEIVED DATA TO TEXTVIEWS AND IMAGEVIEWS
    nameTxt.setText(g.getName());
    descTxt.setText(g.getDescription());
    dateDetailTextView.setText(getDateToday());
    galaxyImg.setImageResource(g.getImage());
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);

    initializeWidgets();
    receiveAndShowData();
  }
}
//end









































