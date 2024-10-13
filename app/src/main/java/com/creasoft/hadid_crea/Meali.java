package com.creasoft.hadid_crea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Meali extends AppCompatActivity {
    TextView tv_meal;
    String meal_metni;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meali);

        tv_meal=(TextView)findViewById(R.id.tv_meali);
        meal_metni="Medine döneminde inmiştir. 29 âyettir. Sûre, adını 25. âyette geçen\t\t\n" +
                "\t\t\n" +
                "1.Göklerdeki ve yerdeki her şey Allah'ı tespih etmektedir. O, mutlak güç sahibidir, hüküm ve hikmet sahibidir.\t\n" +
                "2.Göklerin ve yerin hükümranlığı yalnızca O'nundur. Diriltir, öldürür. O her şeye hakkıyla gücü yetendir.\t\n" +
                "3.O, ilk ve sondur. Zâhir ve Bâtın'dır. O, her şeyi hakkıyla bilendir.\t\n" +
                "4.O, gökleri ve yeri altı günde (altı evrede) yaratan, sonra Arş'a kurulandır. Yere gireni, ondan çıkanı, gökten ineni, oraya yükseleni bilir. Nerede olsanız, O sizinle beraberdir. Allah bütün yaptıklarınızı hakkıyla görendir.\t\n" +
                "5.Göklerin ve yerin hükümranlığı O'nundur. Bütün işler ancak ona döndürülür.\t\n" +
                "6.Geceyi gündüze sokar, gündüzü de geceye sokar. O, göğüslerin özünü (kalplerde olanı) hakkıyla bilendir.\t\n" +
                "7.Allah'a ve Resülüne iman edin ve sizi üzerinde tasarrufa yetkili kıldığı maldan, (Allah yolunda) harcayın. İçinizden iman edip de (Allah yolunda) harcayanlar var ya; onlar için büyük bir mükafat vardır.\t\n" +
                "8.Peygamber, sizi, Rabbinize iman etmeniz için davet edip dururken size ne oluyor da Allah'a iman etmiyorsunuz? Halbuki (Allah ezelde) sizden sağlam bir söz de almıştı. Eğer inanacak kimselerseniz (bu çağrıya uyun).\t\n" +
                "9.O, sizi karanlıklardan aydınlığa çıkarmak için kulu Muhammed'e apaçık âyetler indirendir. Şüphesiz Allah, size karşı çok esirgeyici, çok merhametlidir.\t\n" +
                "10.Size ne oluyor da, Allah yolunda harcama yapmıyorsunuz? Halbuki göklerin ve yerin mirası Allah'ındır. İçinizden, fetihten (Mekke fethinden) önce harcayanlar ve savaşanlar, (diğerleri ile) bir değildir. Onların derecesi, sonradan harcayan ve savaşanlardan daha yüksektir. Bununla beraber Allah hepsine de en güzel olanı (cenneti) vadetmiştir. Allah bütün yaptıklarınızdan hakkıyla haberdardır.\t\n" +
                "11.Kim Allah'a güzel bir borç verecek ki, Allah da onu kendisine kat kat ödesin. Ona çok değerli bir mükafat da vardır.\t\n" +
                "12.Mü'min erkeklerle mü'min kadınların nurlarının, önlerinde ve sağlarında koştuğunu göreceğin gün kendilerine şöyle denir: \"Bugün size müjdelenen şey içlerinden ırmaklar akan, ebedi olarak kalacağınız cennetlerdir.\" İşte bu büyük başarıdır.\t\n" +
                "13.Münafık erkeklerle münafık kadınların, iman edenlere, \"Bize bakın ki sizin ışığınızdan biz de aydınlanalım\" diyecekleri gün kendilerine, \"Arkanıza (dünyaya) dönün de bir ışık arayın\" denilecektir. Derken aralarına kapısı olan bir sur çekilir. Bunun iç tarafında rahmet, onlar (münafıklar) tarafındaki dış cihetinde ise azap vardır.\t\n" +
                "14.(Münafıklar) mü'minlere şöyle seslenirler: \"Biz de (dünyada) sizinle beraber değil miydik?\" (Mü'minler de) derler ki: \"Evet, fakat siz kendinizi yaktınız. Başımıza musibetler gelmesini gözlediniz, şüphe ettiniz. Allah'ın emri gelinceye kadar kuruntular sizi aldattı. O çok aldatıcı (şeytan) Allah hakkında da sizi aldattı.\"\t\n" +
                "15.Bugün artık ne sizden, ne de inkar edenlerden bir fidye alınır. Barınağınız ateştir. Size yaraşan odur. Orası gidilecek ne kötü yerdir!\t\n" +
                "16.İman edenlerin Allah'ı zikretmekten ve inen haktan dolayı kalplerinin saygı ile ürpermesinin zamanı gelmedi mi? Daha önce kendilerine kitap verilip de, üzerinden uzun zaman geçen, böylece kalpleri katılaşanlar gibi olmasınlar. Onlardan bir çoğu fasık kimselerdir.\t\n" +
                "17.Bilin ki Allah, yeryüzünü ölümünden sonra diriltmektedir. Düşünesiniz diye gerçekten, size âyetleri açıkladık.\t\n" +
                "18.Şüphesiz ki sadaka veren erkeklerle sadaka veren kadınlar ve Allah'a güzel bir borç verenler var ya, (verdikleri) onlara kat kat ödenir. Ayrıca onlara çok değerli bir mükafat da vardır.\t\n" +
                "19.Allah'a ve Peygamberlerine iman edenler var ya, işte onlar sıddîklar (sözü özü doğru kimseler) ve Allah katında şahitlerdir. Onların mükafatları ve nurları vardır. İnkar edip âyetlerimizi yalanlayanlara gelince; işte onlar cehennemliklerdir.\t\n" +
                "20.Bilin ki, dünya hayatı ancak bir oyun, bir eğlence, bir süs, aranızda karşılıklı bir övünme, çok mal ve evlat sahibi olma yarışından ibarettir. (Nihayet hepsi yok olur gider). Tıpkı şöyle: Bir yağmur ki, bitirdiği bitki çiftçilerin hoşuna gider. Sonra kurumaya yüz tutar da sen onu sararmış olarak görürsün. Sonra da çer çöp olur. Ahirette ise (dünyadaki amele göre ya) çetin bir azap ve(ya) Allah'ın mağfiret ve rızası vardır. Dünya hayatı, aldanış metaından başka bir şey değildir.\t\n" +
                "21.Rabbinizden bir bağışlanmaya ve eni, gökle yerin genişliği kadar olan, Allah'a ve Resûlüne inananlar için hazırlanan cennete yarışırcasına koşun. İşte bu, Allah'ın lütfudur. Onu dilediğine verir. Allah büyük lütuf sahibidir.\t\n" +
                "22.Yeryüzünde ve kendi nefislerinizde uğradığınız hiçbir musibet yoktur ki, biz onu yaratmadan önce, bir kitapta (Levh-i Mahfuz'da) yazılmış olmasın. Şüphesiz bu, Allah'a göre kolaydır.\t\n" +
                "23.Elinizden çıkana üzülmeyesiniz ve Allah'ın size verdiği nimetlerle şımarmayasınız diye (böyle yaptık.) Çünkü Allah, kendini beğenip övünen hiçbir kimseyi sevmez.\t\n" +
                "24.Onlar cimrilik edip insanlara da cimriliği emreden kimselerdir. Kim yüz çevirirse bilsin ki şüphesiz Allah ganîdir, zengindir, övülmeye lâyıktır.\t\n" +
                "25.Andolsun, biz elçilerimizi açık mucizelerle gönderdik ve beraberlerinde kitabı ve mizanı (ölçüyü) indirdik ki, insanlar adaleti yerine getirsinler. Kendisinde müthiş bir güç ve insanlar için birçok faydalar bulunan demiri yarattık (ki insanlar ondan yararlansınlar). Allah da kendisine ve Resüllerine gayba inanarak yardım edecekleri bilsin. Şüphesiz Allah kuvvetlidir, mutlak güç sahibidir.\t\n" +
                "26.Andolsun, biz Nûh'u ve İbrahim'i peygamber olarak gönderdik. Peygamberliği ve kitabı onların soylarına da verdik. Onlardan kimi doğru yola ermiştir, ama içlerinden birçoğu da fasık kimselerdir.\t\n" +
                "27.Sonra bunların peşinden ardarda peygamberlerimizi gönderdik. Onların arkasından da Meryem oğlu İsa'yı gönderdik, ona İncil'i verdik ve kendisine uyanların kalplerine şefkat ve merhamet duygusu koyduk. (Kendiliklerinden) icat ettikleri ruhbanlığa gelince; biz onu onlara farz kılmamıştık. Allah'ın rızasını kazanmak için onu kendileri icat etmişlerdi. Fakat ona da gereği gibi uymadılar. Biz de içlerinden iman edenlere mükafatlarını verdik. Fakat onlardan birçoğu da fasık kimselerdir.\t\n" +
                "28.Ey iman edenler; Allah'a karşı gelmekten sakının ve peygamberine iman edin ki, size rahmetinden iki kat pay versin, size kendisiyle yürüyeceğiniz bir nur versin ve sizi bağışlasın. Allah çok bağışlayıcıdır, çok merhamet edicidir.\t\n" +
                "29.Bunları açıkladık ki, kitap ehli, Allah'ın lütfundan hiçbir şeyi kendilerine has kılmaya güçlerinin yetmeyeceğini ve lütfun, Allah'ın elinde olduğunu, onu dilediği kimseye vereceğini bilsinler. Allah büyük lütuf sahibidir.\t\n" +
                "\n";
        tv_meal.setText(meal_metni);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
