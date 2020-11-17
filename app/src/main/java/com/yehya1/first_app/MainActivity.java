package com.yehya1.first_app;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<TheListItem> listItems;

    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView =  findViewById(R.id.list_view);
        listItems = new ArrayList<>();


        listItems.add(new TheListItem("الحديث 1: إنما الأعمال بالنيات"));
        listItems.add(new TheListItem("الحديث 2: بيان الإسلام والإيمان والإحسان"));
        listItems.add(new TheListItem("الحديث 3: أركان الإسلام"));
        listItems.add(new TheListItem("الحديث 4: الأعمال بخواتيمها"));
        listItems.add(new TheListItem("الحديث 5: إبطال المنكرات والبدع"));
        listItems.add(new TheListItem("الحديث 6: الحلال بين والحرام بين"));
        listItems.add(new TheListItem("الحديث 7: الدين النصيحة"));
        listItems.add(new TheListItem("الحديث 8: حرمة المسلم"));
        listItems.add(new TheListItem("الحديث 9: التكليف بما يستطاع"));
        listItems.add(new TheListItem("الحديث 10: الإقتصار على الحلال الطيب"));
        listItems.add(new TheListItem("الحديث 11: التورع عن الشبهات"));
        listItems.add(new TheListItem("الحديث 12: ترك مالا يعني المسلم"));
        listItems.add(new TheListItem("الحديث 13: كمال الإيمان"));
        listItems.add(new TheListItem("الحديث 14: متى يحل دم المسلم"));
        listItems.add(new TheListItem("الحديث 15: أداب إسلامية"));
        listItems.add(new TheListItem("الحديث 16: النهي عن الغضب"));
        listItems.add(new TheListItem("الحديث 17: الأمر بإحسان الذبح والقتل"));
        listItems.add(new TheListItem("الحديث 18: حسن الخلق"));
        listItems.add(new TheListItem("الحديث 19: إحفظ الله يحفظك"));
        listItems.add(new TheListItem("الحديث 20: الحياء من الإيمان"));
        listItems.add(new TheListItem("الحديث 21: قل آمنت بالله ثم استقم"));
        listItems.add(new TheListItem("الحديث 22: الإقتصار على الفرائض يدخل الجنة"));
        listItems.add(new TheListItem("الحديث 23: الإسراع في طيب"));
        listItems.add(new TheListItem("الحديث 24: تحريم الظلم"));
        listItems.add(new TheListItem("الحديث 25: ذهب أهل الدثور بالأجور"));
        listItems.add(new TheListItem("الحديث 26: ربط الإسلام بين الناس وإعانتهم والعدل بينهم"));
        listItems.add(new TheListItem("الحديث 27: البر حسن الخلق"));
        listItems.add(new TheListItem("الحديث 28: وجوب لزوم السنن"));
        listItems.add(new TheListItem("الحديث 29: ما يلزم الجنة"));
        listItems.add(new TheListItem("الحديث 30: حقوق الله تعالى"));
        listItems.add(new TheListItem("الحديث 31: الزهد الحقيقي"));
        listItems.add(new TheListItem("الحديث 32: لا ضرر ولا ضرار"));
        listItems.add(new TheListItem("الحديث 33: البينة على المدعى واليمين على من أنكر"));
        listItems.add(new TheListItem("الحديث 34: النهي عن المنكر من الإيمان"));
        listItems.add(new TheListItem("الحديث 35: أخوة الإسلام"));
        listItems.add(new TheListItem("الحديث 36: فضل الإجتماع على تلاوة القرآن  على الذكر"));
        listItems.add(new TheListItem("الحديث 37: كرم الله تعالى"));
        listItems.add(new TheListItem("الحديث 38: العبادة لله وسيلة التقرب المحبة"));
        listItems.add(new TheListItem("الحديث 39: التجاوز عن المخطئ والناسي والمكره"));
        listItems.add(new TheListItem("الحديث 40: الدنيا وسيلة ومزرعة للآخرة"));
        listItems.add(new TheListItem("الحديث 41: علامة الإيمان"));
        listItems.add(new TheListItem("الحديث 42: عفو الله تعالى"));

        TheListItemAdapter adapter = new TheListItemAdapter(getApplicationContext() , listItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:

                        MyCustemAlertDialog(R.drawable.content1);

                        break;

                    case 1:

                        MyCustemAlertDialog(R.drawable.content2);

                        break;

                    case 2:


                        MyCustemAlertDialog(R.drawable.content3);

                        break;

                    case 3:

                        MyCustemAlertDialog(R.drawable.content4);

                        break;

                    case 4:

                        MyCustemAlertDialog(R.drawable.content5);

                        break;

                    case 5:

                        MyCustemAlertDialog(R.drawable.content6);

                        break;

                    case 6:

                        MyCustemAlertDialog(R.drawable.content7);

                        break;

                    case 7:
                        MyCustemAlertDialog(R.drawable.content8);

                        break;

                    case 8:

                        MyCustemAlertDialog(R.drawable.content9);

                        break;

                    case 9:

                        MyCustemAlertDialog(R.drawable.content10);

                        break;

                    case 10:

                        MyCustemAlertDialog(R.drawable.content11);

                        break;

                    case 11:

                        MyCustemAlertDialog(R.drawable.content12);

                        break;

                    case 12:

                        MyCustemAlertDialog(R.drawable.content13);

                        break;

                    case 13:

                        MyCustemAlertDialog(R.drawable.content14);

                        break;

                    case 14:

                        MyCustemAlertDialog(R.drawable.content15);

                        break;

                    case 15:

                        MyCustemAlertDialog(R.drawable.content16);

                        break;

                    case 16:

                        MyCustemAlertDialog(R.drawable.content17);

                        break;

                    case 17:

                        MyCustemAlertDialog(R.drawable.content18);

                        break;

                    case 18:

                        MyCustemAlertDialog(R.drawable.content19);

                        break;

                    case 19:

                        MyCustemAlertDialog(R.drawable.content20);

                        break;

                    case 20:

                        MyCustemAlertDialog(R.drawable.content21);

                        break;

                    case 21:

                        MyCustemAlertDialog(R.drawable.content22);

                        break;

                    case 22:

                        MyCustemAlertDialog(R.drawable.content23);

                        break;

                    case 23:

                        MyCustemAlertDialog(R.drawable.content24);

                        break;

                    case 24:

                        MyCustemAlertDialog(R.drawable.content25);

                        break;

                    case 25:

                        MyCustemAlertDialog(R.drawable.content26);

                        break;

                    case 26:

                        MyCustemAlertDialog(R.drawable.content27);

                        break;

                    case 27:

                        MyCustemAlertDialog(R.drawable.content28);

                        break;

                    case 28:

                        MyCustemAlertDialog(R.drawable.content29);

                        break;

                    case 29:

                        MyCustemAlertDialog(R.drawable.content30);

                        break;

                    case 30:

                        MyCustemAlertDialog(R.drawable.content31);

                        break;

                    case 31:

                        MyCustemAlertDialog(R.drawable.content32);

                        break;

                    case 32:

                        MyCustemAlertDialog(R.drawable.content33);

                        break;

                    case 33:

                        MyCustemAlertDialog(R.drawable.content34);

                        break;
                    case 34:

                        MyCustemAlertDialog(R.drawable.content35);

                        break;

                    case 35:


                        MyCustemAlertDialog(R.drawable.content36);
                        break;

                    case 36:

                        MyCustemAlertDialog(R.drawable.content37);
                        break;

                    case 37:

                        MyCustemAlertDialog(R.drawable.content38);
                        break;

                    case 38:

                        MyCustemAlertDialog(R.drawable.content39);
                        break;

                    case 39:

                        MyCustemAlertDialog(R.drawable.content40);

                        break;

                    case 40:

                        MyCustemAlertDialog(R.drawable.content41);

                        break;

                    case 41:

                        MyCustemAlertDialog(R.drawable.content42);
                        break;


                }
            }
        });

    }

    public void MyCustemAlertDialog(int image){

        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_itemdialog);


        ImageView imageView = dialog.findViewById(R.id.image_item);
        Button close = dialog.findViewById(R.id.close_btn);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-1971289391126138/3577280215");

        adView = dialog.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.setAdListener(new AdListener(){

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
              //  Toast.makeText(getApplicationContext(),"RKAd Loaded",Toast.LENGTH_SHORT).show();
                Log.d("admob","RKAd Loaded");
            }

            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
         //       Toast.makeText(getApplicationContext(),"Ad Failed to load",Toast.LENGTH_SHORT).show();
                Log.d("admob","Ad Failed to load" + "- Number"+i);
            }
        });
        adView.loadAd(adRequest);
        imageView.setImageResource(image);

        close.setEnabled(true);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });

        dialog.show();
    }
}
