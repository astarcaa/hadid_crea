package com.creasoft.hadid_crea;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Turkce_Okunus extends AppCompatActivity {
    TextView tv_turkce_okunus;
    String turkce_okunus_metin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkce__okunus);

        tv_turkce_okunus=(TextView)findViewById(R.id.tv_turkce_okunus);
        turkce_okunus_metin="1.Sebbeha lillahi ma fiyssemavati velardi ve huvel'aziyzulhakiymu.\t\n" +
                "2.Lehu mulkussemavati vel'ardi yuhyiy ve yumiytu ve huve 'ala kulli sey'in kadiyrun.\t\n" +
                "3.Huvel'evvelu vel'ahiru vezzahiru velbatinu ve huve bikulli sey'in 'aliymun.\t\n" +
                "4.Huvelleziy halekassemavati vel'arda fiy sitteti eyyamin summesteva 'alel'arsi ya'lemu ma yelicu fiylardi ve ma yahrucu minha ve ma yenzilu minessemai ve ma ya'rucu fiyha ve huve me'akum eyne ma kuntum vallahu bima ta'melune besiyrun.\t\n" +
                "5.Lehu mulkussemavati vel'ardi ve ilellahi turce'ul'umuru.\t\n" +
                "6.Yuliculleyle fiynnehari ve yulicunnehare fiylleyli ve huve 'aleymun bizatissuduri.\t\n" +
                "7.Aminu billahi ve resulihi ve enfiku mimma ce'alekum mustahlefiyne fiyhi felleziyne amenu minkum ve enfeku lehum ecrun kebiyrun.\t\n" +
                "8.Ve ma lekum la tu'minune billahi verresulu yed'ukum litu'minu birabbikum ve kad ehaze miysakakum in kuntum mu'miniyne.\t\n" +
                "9.Huvelleziy yunezzilu 'ala 'abdihi ayiten beyyinatin liyuhricekum minezzilimati ilennuri ve innallahe bikum lereufun rahiymun.\t\n" +
                "10.Ve malekum ella tunfiku fiy sebiylellahi ve lillahi miyrasussemavati vel'ardi la yesteviy minkum men enfeka min kablilfethi ve katele ulaike a'zamu dereceten minelleziyne enfeku min ba'du ve katelu ve kullen ve'adallahulhusna vallahu bima ta'melune habiyrun.\t\n" +
                "11.Men zelleziy yukridullahe kardan hasenen feyuda'ifehu lehu ve lehu ecrun keriymun.\t\n" +
                "12.Yevme terelmu'miniyne velmu'minati yes'a nuruhum beyne eydiyhim ve bieymanihim busrakumulyevme cennatun tecriy min tahtihel'enharu haliduyne fiyha zalike huvelfevzul'aziymu.\t\n" +
                "13.Yevme yekululmunafikune velmunafikatu lilleziyne amenunzurna naktebis min nurikum kiylerci'u veraekum feltemisu nuren feduribe beynehum bisurin lehu babun batinuhu fiyhirrahmetu ve zahiruhu min kibelihul'azabu.\t\n" +
                "14.Yunadunehum elem nekun me'akum kalu bela ve lakinnekum fetentum enfusekum ve terabbastum vertebtum ve garretkumul'emaniyyu hatta cae emrullahi ve garrekum billahilgaruru.\t\n" +
                "15.Felyevme la yu'hazu minkum fidyetun ve la minelleziyne keferu me'vakumunnaru hiye mevlakum ve bi'selmesiyru.\t\n" +
                "16.Elem ye'ni lilleziyne amenu en tahse'a kulubuhum lizikrillahi ve ma nezele minelhakki vela yekunu kelleziyne utulkitabe min kablu fetale 'aleyhimul'emedu fekaset kulubuhum ve kesiyrun minhum fasikune.\t\n" +
                "17.I'lemu ennallahe yuhyiyl'arda ba'de mevtiha kado beyyenna lekumul'ayati le'allekum ta'kilune.\t\n" +
                "18.Innelmusaddikiyne velmusaddikati ve akredullahe kardan hasenen yuda'afu lehum ve lehum ecrun keruymun.\t\n" +
                "19.Velleziyne amenu billahi ve rusulihi ulaik humussiddiykune vessuhedau'inde rabbihim lehum ecruhum ve nuruhum velleziyne keferu ve kezzebu biayatina ulaik ashabulcahiymi.\t\n" +
                "20.I'lemu ennemelhayatuddnuya le'ibun ve lehvun ve ziynetun ve tefahurun beynekum ve ziynetun ve tefahurun biynekum ve tekasurun fiyl'emvali vel'evladi kemeseli gaysin a'cebelkuffare nebatuhu summe yekunu hutamen ve fiyl'ahireti 'azabun seduydun ve magfiretun minallahi ve ridvanun ve melhayatuddunya illa meta'ulgururi.\t\n" +
                "21.Sabiku ila magfiretin min rabbikum ve cennetin 'arduha ke'ardissemai vel'ardi u'iddet lilleziyne amenu billahi ve rusulihi zalike fadlullahi yu'tiyhi men yesa'u vallahu zulfadlil'aziymi.\t\n" +
                "22.Ma esabe min musiybetin fiyl'ardi ve la fiy enfusikum illa fiy kitabin min kabli en nebreeha inne zalike 'alellahi yesiyrun.\t\n" +
                "23.Likeyla te'sev 'ala ma fatekum ve la tefrahu bima atakum vallahu la yuhibbu kulle muhtalin fehurin.\t\n" +
                "24.Elleziyne yebhalune ve ye'murunennase bilbuhli ve men yetevelle feinnallahe huvelganiyyulhamiydu.\t\n" +
                "25.Lekad erselna rusulena bilbeyyinati ve enzelna me'ahumulkitabe velmiyzane liyekumennasu bilkisti ve enzelnelhadiyde fiyhi be'sun sediydun ve menafi'u linnasi ve liya'lemallahu men yensuruhu ve rusulehu bilgaybi innallahe kaviyyun 'aziyzun.\t\n" +
                "26.Ve lekad erselna nuhan ve ibrahiyme ve ce'alna fiy zurriyyetihimennubuvvete velkitabe feminhum muhtedin ve kesiyrun minhum fasikune.\t\n" +
                "27.Summe kaffeyna 'ala asarihim birusulina ve kaffeyna bi'iysebni meryeme ve ateynahul'inciyle ve ce'alna fiy kulubilleziynettebe'uhu re'feten ve ramheten ve rehbaniyyetenibtede'uha ma ketebnaha 'aleyhim illebtigae ridvanillahi fema re'avha hakka ri'ayetiha feateynelleziyne amenu minhum ecrehum ve kesiyrun minhum fasikune.\t\n" +
                "28.Ya eyyuhelleziyne amenuttekullahe ve aminu biresulihi yu'tikum kifleyni min rahmetihi ve yec'al lekum nuren temsune bihi ve yagfir lekum vallahu gafurun rahiymun.\t\n" +
                "29.Liella ya'leme ehlulkitabi ella yakdirune 'ala sey'in min fadlillahi ve ennelfadle biyedillahi yu't'yhi men yesa'u'vallahu zulfadlil'aziymi.\t\n" +
                "\n";
        tv_turkce_okunus.setText(turkce_okunus_metin);


        Button play,pause;
        final MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.dua);
        play=(Button)findViewById(R.id.btn_play_o);
        pause=(Button)findViewById(R.id.btn_pause_o);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();

            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();

            }
        });

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
