package com.creasoft.hadid_crea;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Tefsiri extends AppCompatActivity {
    TextView tv_tefsiri;
    String fazilet_metin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tefsiri);

        tv_tefsiri=(TextView)findViewById(R.id.tv_tefsiri);
        fazilet_metin="57-HADİD:\n" +
                "1. Allah'ı yahut Allah için tesbih etmektedir. \n" +
                "Tesbih, Allah Teâlâ'yı, kutsal yüceliğine layık olmayan kusurlardan gerek itikad gerek söz ve gerek kalb ile tenzih etmek ve uzak tutmaktır. \n" +
                "Takdis kavramının anlamı da böyledir. Bunlar esasen uzak gitmek ve uzaklaştırmak mânâsını ifade etmektedirler. Nitekim sözü, \"Suda uzağa gitti.\" sözü de \"Arzda uzağa gitti.\" mânâsına gelmektedir. \n" +
                "Binaenaleyh, gerek melâike ve müminler gibi sözle, gerek diğer varlıklar gibi ilham yoluyla konuşanların hepsi dahil olmak üzere mecazî bir anlam da kasdedilmiş olabilir. \n" +
                "Çünkü yaratılan her varlık, imkân (olabilirlik) ve hudûsu (sonradan olmayı) ve arzettiği sanat nizamı ile Allah Teâlâ'nın noksanlıklardan münezzeh (berî) ve yüceliğin son derecesindeki sıfatlarla vasıflanmış olan varlığına delalet etmektedir. (Bu hususta bilgi için (İsrâ, 17/44) âyetine bkz.) \"O çok güçlüdür, hüküm ve hikmet sahibidir.\" Bu cümle, tesbihin şekline işaret etmektedir.\n" +
                "2. \"Göklerin ve yerin mülkü O'nundur.\" Yani âlemdeki bütün küllî tasarruf; var etme, yok etme ve diğer bilinen ve bilinmeyen tasarrufların hepsi O'nun içindir. \"O yaşatır ve öldürür.\" \n" +
                "Bu cümle mülke dair hükümlerden bir kısmını beyan etmektedir. \"O her şeye kadirdir.\" Bu da, hepsini bütün şartlarıyla özetlemektedir.\n" +
                "3. O'dur Evvel, her şeyden önce, başlangıcı yoktur ve her şeyin ilkidir. Çünkü varlıkların hepsinin başlangıcı ve hepsini ortaya çıkarandır. \n" +
                "Ve son, hepsinin yok olmasından sonra O, bâkidir \"O'nun zâtından başka her şey helak olacaktır...\" (Kasas, 28/88), \"Yer yüzünde bulunan her canlı yok olacak, ancak azamet ve ikram sahibi Rabbinin zâtı bâki kalacak .\" \n" +
                "Binaenaleyh O'nun için ne yalnız Zâhir ne de yalnız Bâtın diye hükmetmemeli, hükmü, âtıftan sonraya bırakarak \"Zâhir ve Bâtın\" demelidir. Evvel ve Âhir sıfatları da böyledir. Ebu's-Suud'un da ifade ettiği gibi deki\"vâv\", bu iki vasfın tamamını önceki ilk vasfa bağlamaktadır. Buna göre hüküm, atıf yapmadan (vav ile bağlamadan) önce olabilirse de \"ve'l-Âhir\" ile \"ve'l-Bâtın\" sıfatlarında hüküm, atıf yapıldıktan sonradır. Ancak hepsinde de hükmü atıftan sonraya bırakmak daha doğrudur. Çünkü \"hüve\" zamiri \"Allah\" ismine aittir. \n" +
                "4. \"O'dur yaratan...\" Bu da mülk hükümlerinden bir kısmını beyan etmektir. \"altı günde.\" (Bu hususla ilgili olarak A'raf, 7/54. ve Fussilet, 41/10-12. âyetlerin tefsirine bkz.) Sonra arş üzerine istivâ etti. Yani yaratıp öylece bırakıvermedi, işi idare edip düzenlemektedir. (İstivâ hakkında A'râf Sûresi'ndeki, \n" +
                "7/54. âyette tafsilat geçti. Oraya bkz.) (Allah) yere gireni de bilir, tohumlar gibi ondan çıkanı da, ekinler gibi. Gökten ineni de, yağmurlar gibi ona çıkanı da, buharlar gibi. Ve her nerede olursanız o sizinle beraberdir. \n" +
                "Onun ilmi ve kudreti yanınızdan ayrılmaz. Ve Allah her ne yaparsanız görücüdür. Görür ve ona göre karşılığını verir.\n" +
                "5. \"Göklerin ve yerin mülkü O'nundur.\" Bu cümle, sûrenin başında zikredildiği gibi burada da te'kit için tekrar edilmiştir. Yani hem ibtidada (yaratmada) hem iâdede (diriltmede) zikredilmiştir. Çünkü her ikisinin de mukaddimesi gibidir. Bir de istihlâftan (vekil bırakmadan) bahsedileceği için bu hatırlatmanın te'kid edilmesinde başka bir önemli fayda vardır. \n" +
                "Ve bütün işler, Allah'a döndürülür. Çünkü ilk ve son O'dur. Binaenaleyh gerek mal ve mülkünüzde ve gerek diğer hususlardaki tasarruflarınızın bile evveli ve sonrası ona döndürülecektir. Bu yüzden bütün her şeyin kulluk adına O'nun için icrâ edilmesi gerekmektedir.\n" +
                "6. \"Geceyi gündüze sokar, gündüzü geceye sokar.\" Yani zamanın acı tatlı bütün değişiklikleri O'nun hükmü altındadır. \n" +
                "Gamları, sevince, sevinçleri gama, kedere tebdil eden ve zulmet içinde nur, nur içinde zulmet yaratan O'dur. Hem O, bütün göğüslerin künhünü (hakikatini) bilir. \n" +
                "En gizli fikirleri, niyetleri, acı ve kederleri ve her türlü duyguyu O bilir.\n" +
                "Onun için:\n" +
                "7. Sıfatı, yukarıda zikredildiği şekilde Allah'a iman etmekle beraber Resulüne de iman edin. \n" +
                "Çünkü Allah'ın tebliğini, emirlerini nehiylerini O, getirecek o, beyan edecektir. İman edin de sizin yönetiminize verdiği şeylerden harcayın. \n" +
                "Yani hakikatte mülk onun olduğu gibi milk de onundur. Siz O'nun olduğunuz gibi sizin milk diye sahip olduğunuz şeyler de O'nundur. Ancak selâhiyyet verip onlarda tasarruf etmek için sizi halife kılmıştır. Bundan dolayı size vekil gibi izin verdiği hususlarda tasarruf edebilirsiniz. \n" +
                "O halde iman ederek sizi vekil tayin ettiği bütün varlıkta kendinizi asîl değil, O'nun vekili bilerek Hakk'ın yolunda ve beyan ettiği hususlarda harcamada bulununuz. Nitekim bir beyitte de şöyle denilmiştir:\n" +
                "\"Mal ve çoluk çocuk birer emanetten başka bir şey değildir. Bir gün olup da emanetlerin geri verilmesi ise gereklidir.\"\n" +
                "Bazı âlimler, \"Bu infaktan (harcamadan) maksat, zekattır.\" demişlerse de doğrusu, vacib ve nafile harcamayı içine almış olmasıdır. \n" +
                "8-9-10. Halbuki Allah sizden kesin söz almıştı. \n" +
                "Fiilinin zamiri, hem Allah'a hem de Resulü'ne ait olabilir. Allah'a ait olduğu düşünülürse o zaman buradaki misâktan maksat, yaratılış sözü olan \"Evet Rabbimizsin dediler\". mîsakıdır ki, delil getirme ve düşünceye yerleştirme şeklinde de yorumlanmıştır. \n" +
                "Resulullah (s.a.v)'a ait olduğu kabul edilirse bu duruma göre de ona yapılan biât anlamına alınabilir. Zira Ubâde b. Sâmit (r.a.)'den rivayet edildiğine göre Sahabiler Hz. Peygamber'e, canlılık ve gevşeklik halinde işitip itaat etme, zorluk ve kolaylık durumunda nafaka verme, iyiliği emredip kötülükten sakındırma ve kınayanın kınamasından korkmayarak Allah Teâlâ ile ilgili söz söyleme konusunda biât etmişlerdi. \n" +
                "\"Fetihten önce\" Burada fetihten kasıt, Mekke'nin fethi, yahut hakkında Fetih Sûresi'nin indiği Hudeybiye'dir Bu ibareden de, onuncu âyetin Medine'de nazil olduğu anlaşılır. Müfessir el-Vâhidî'nin rivâyetine göre bu âyet, Ebû Bekr (r.a.) hakkında indirilmiştir. \n" +
                "Bu söz Hz. Peygamber (s.a.v)'e ulaştığında buyurdu ki: \"Ashabımı benim için bırakın, nefsim kudret elinde bulunan O yüce zât'a yemin ederim ki, siz dağlar kadar altın infak etseniz, yine de onların amellerine yetişemezsiniz.\" Görüldüğü gibi bu hadis, ile işaret olunanların Hudeybiye'den önce infak edenler olduğunu kuvvetlendirmektedir. \n" +
                "Çünkü, Hâlid b. Velid'in müslüman olması hadisesi, Hudeybiye'den sonra, Mekke'nin fethinden önce idi. Şu halde fetihten maksat, Hudeybiye demektir. Ancak Zemahşerî gibi bir çok âlim, onu Mekke'nin fethi olarak kabul etmişlerdir.\n" +
                "Hüsnâ, birçok kere geçtiği gibi, en güzel mükafat, yani cennet anlamını ifade etmektedir.\n" +
                "11. \"Hani kim o Allah'a güzel bir ödünç verecek kimse?\" Bu âyetin bir benzeri de Bakara, 2/245. âyetidir. Bilgi için oraya bakınız. Karz, başlangıcı ödünç verme, sonucu bey-i sarf (para cinslerinin bir biriyle satışı) olan bir muameledir.Karz-ı hasen, güzel ödünç anlamını ifade etmekle beraber burada malın en iyisini seçip Allah rızası için halis niyetle faydalı olan hususlara sarf etmek demektir.\n" +
                "12-13. Göreceğin günü zarfına veya yaya da hazfedilen fiiline bağlıdır. Yani kıyamet günü \"Onların önlerinde ve sağlarında nurları koşar.\" İbnü Ebî Şeybe, İbnü Cerir, İbnü Münzir, İbnü Ebî Hâtim, Hâkim ve İbnü Merdûye'nin İbnü Mes'ud (r.a.)'dan naklettikleri bir rivâyette o şöyle demiştir: \"Müminlere amellerine göre nur verilir. Bu nurla onlar sıratı geçerler. \n" +
                "Kiminin nuru dağ gibi, kiminin nuru ağaç gibidir. En aşağıda olanın nuru baş parmağındadır ki bir yanar bir söner.\" Ebû Hayyan da der ki: \"Anlaşıldığına göre bu nur iki kısımdır. Birisi önlerindedir, gidecekleri yeri aydınlatır. Birisi de sağ taraflarındadır.\" Cumhura göre de nurun aslı, onların sağlarında olan nurdur.\n" +
                "Önlerinde bulunan nur, bu asıl nur olan yayılan ışıktır. Bir de denilmiştir ki. \"Buradaki , mânâsına olup, \"sağ taraflarından\" demektir ki bu da, \"her taraflarından\" mânâsınadır. \n" +
                "\"Eymân\" şeklinde çoğul olarak ifade edilmesi ise, onun şerefinden dolayıdır.\n" +
                "Zemahşerî de şöyle der: \" \"Önlerinden ve sağlarından\" denilmesi, o bahtiyar müminlerin amel defterlerinin bu iki yönden verilmesinden dolayıdır.\" Nitekim cehennemliklerin de sollarından ve arkalarından verilecektir.\" \n" +
                "İbnü Ebî Hâtim, Hâkim ve İbnü Merdûye Abdurrahmân b. Cübeyr b. Nâdir'den, onun şöyle dediğini nakletmişlerdir: \"Ebu Zer ve Ebu'd-Derdâ (r.a.) derlerdi ki, \"Resulullah (s.a.v) buyurdu ki: \"Ben kıyamet günü kendisine secde izni verileceklerin birincisiyim, izin verilip başını kaldıracakların da birincisiyim. Başımı kaldırıp önüme, arkama, sağıma ve soluma bakarım, bakınca bütün ümmetlerin arasında ümmetimi tanırım.\n" +
                "Ya Resululluh Nuh (a.s.)'dan ümmetine kadar bütün ümmetleri nasıl tanırsın? diye sorulduğunda da buyurdu ki: \"Abdest izinden alınları, elleri ve ayakları parıldar.\" Bu durum başka ümmetlerde yoktur. Ve kitapları sağ taraflarından verilir onunla tanırım, yüzlerinde secde izlerinden işaretleri vardır, onunla tanırım. Önlerinden sağ ve sol taraflarından koşan nurlarıyla tanırım.\n" +
                "\" İbnü Ebî Hâtim, Ebû Ümâme (r.a.)'den şöyle bir rivayet nakletmiştir. \"Kıyamet günü bir zulmet salınır, ne mümin ne de kâfir hiç kimse avucunu dahi göremez. Tâ ki Allah Teâlâ, müminlere amelleri kadar nur gönderinceye kadar ...\n" +
                "\" İbnü Cesir ve Beyhaki \"Ba's\"de İbnü Abbas'ın şöyle dediğini naklederler: \"İnsanlar karanlıklar içinde iken Allah Teâlâ bir nur gönderir. Müminler o nuru görünce o tarafa doğru yönelirler. İşte bu nur, onların cennete girmeleri için Allah tarafından gönderilen bir delil olur.\" Bundan sonraki âyetin mânâsından bizim anladığımıza göre, söz konusu nurun müminlerin önlerinde ve sağlarında koşması, solda ve arkada bulunan münafık ve kâfirlerin ondan istifade etmemesi içindir. Binaenaleyh 'ü \"her taraf\" mânâsına yorumlamak doğru değildir. , dan bedeldir.\n" +
                " İbnü Atiye demiştir ki, sözüne de zarf olabilir. Yani münafıkların şöyle şöyle dedikleri gün, müminler o büyük kurtuluşa erecekler demektir. Münafıklar, Medine'de olduğuna göre bu âyetlerin de medenî olmaları gerekir. Bize bakınız sizin nurunuzdan alalım, yani müminler nurları önlerinde ve sağlarında \n" +
                "Ayrıca bu sûrun, cennet ile cehennem arasına çekilmiş bir sed olduğu görüşü de ileri sürülmüştür. Öyle bir sur ki onun bir kapısı vardır. Çok değil sadece bir kapısı, Allah bilir ya bu, iman kapısı olmalıdır. \n" +
                "Çünkü ondan ancak mümin olanlar girebileceklerdir. Batnı yani o kapının yahut sûrun içi ki rahmet ondadır. Hakikatini tarif ve tasvir etmenin mümkün olmadığı bütün sevab ve nimet onun içindedir. \n" +
                "Dışı ise, o yüzden yani o kapı ve sûr tarafından azabtır. Dışındakilere azab o yönden gelir.\n" +
                "14. Münafıklar, müminlere: \"Biz sizinle beraber değilmiydik?\" diye bağrışırlar. Dünyada sadece dilleriyle deyip mümin göründüklerini söylemek isterler. Buna karşı müminler diyecekler evet.. velakin sizler kendilerinizi fitneye soktunuz. \n" +
                "Yani münafıklık yaparak kendinizi meşakkate düşürdünüz, ateşe doğru gittiniz ve helak ettiniz. Ve gözettiniz müminlere belâ ve musibet gelmesini beklediniz. \n" +
                "15. \"Bu gün.\" \"Fâ\" sebebiyyedir, yani o sebebten dolayı bugün sizden hiçbir fidye kabul edilmez, kendinizi kurtarmak için her ne kadar kurtuluş fidyesi verecek olsanız kabul edilmez. Ne de küfredenlerden, sadece sizin gibi gizlice değil, açıkca ve bâtınen küfredenlerden de fidye kabul edilmez. \n" +
                "Me'vânız, sığınacağınız yer, ateş yani cehennemdir. İşinizi görecek koruyucunuz, yahut layıkınız, en uygun olan cezanız odur. O da ne fenâ masîrdir, yani ne fenâ gidilecek yerdir. Yahut ona gidiş de ne fenâdır.\n" +
                "16. \"Ya o iman edenlere çağrı gelmedi mi?\" Bu âyetin de içeriği onun Medine'de indiğini gösterir. Ancak Mekkî olduğuna dair de iki ayrı rivayet vardır. Bunlardan biri, İbnü Mes'ud'dan nakledilmektedir. \n" +
                "O şöyle der: \"Müslüman olmamızın üzerinden henüz dört sene geçmişti ki bu âyet ile uyarıldık. \"Diğeri ise İbnü Abbas'ındır. O da şöyle demiştir: \"Allah Teâlâ, müminlerin kalplerinde bir ağırlık (yavaş hareket) görerek, Kur'ân'ın inişinin on üçüncü senesine girerken bizi azarladı.\" Şu halde bu iki rivayet birbirine zıt olduğu için birini tercih edecek durumda değiliz. Bir de, müminler Mekke'de sıkıntı içinde idiler.\n" +
                "Allah'ın zikrinden maksat, Allah'ın adının anılması, yahut Kur'ân'dır. İnen hak da, meydana gelen olaylara göre Kur'ân ile Allah tarafından indirilen hükümlerdir. İmân, önce bilgi ve sevgi gibi iki ruh hâlini ihtivâ eder. \n" +
                "Sonra da Hak Teâlâ tarafından gelen emir ve nehiylere göre hayırlı işlere teşebbüs etmeyi ve güzel ahlâk ile ahlâklanmayı gerektirir. \n" +
                "Şüphesiz ki Ashab-ı Kiram imanlarının ilk anından itibaren kalpleri Allah'a karşı saygı ile çarpan mahlukatın en üstünü idiler. Bununla beraber ferdlerin tekamül mertebelerindeki hareket ve kabiliyetleri ve her mertebedeki saygı dereceleri farklı olduğu gibi ilk zamanlarda cemiyyet olarak ortaya çıkışlarında henüz o, görünen neş'esini bulamamış kuvvet ve gençlik çağına gelememişti. \n" +
                "İşte bu âyet, bu ruh kanunlarıyla İslâm toplumunun iman konusunda ve amelî fazîletlerde Allah'ı zikir ve Hakk'ın hükümlerine tam bir saygı ve teslimiyyet melekesi kazanarak faaliyyet çağına geçmeleri zamanının geldiğini hatırlatmaktadır. \n" +
                "Çünkü âyetinde buyurulduğu üzere \"Asıl müminler o kimselerdir ki, Allah Teâlâ'nın ism-i celili zikredildiği zaman kalbleri çarpar ve âyetleri okundukça imanları artar.\" (Enfâl, 8/2). Şu halde iman \n" +
                "17.Sonra tabii sebepler karşısında da ümitsizliğe düşülmemek için şöyle buyuruluyor: Biliniz ki Allah Teâlâ yeri ölümünden sonra diriltir. Şüphe yok ki onu dirilten Allah, zamanın uzamasıyla katılaşmış olan kalpleri de yeni bir intibâh ve bir hayat neşesi ile diriltir. \n" +
                "İşte size âyetleri açıkladık belki düşünür anlarsınız da onlara saygı ile sarılır, zamanın uzamasıyla dahi kasvete düşmemek için olgun bir iman ile çalışır, Kur'ân'ın feyziyle âleme yeni yeni hayatlar yayarsınız. Bunu yapabilmek için de Allah yolunda infak ve tasadduk etmek en birinci sebeplerden birini teşkil eder. Bu hususa işaret için şöyle buyurulmuştur.\n" +
                "18. \"Şüphesiz sadaka veren erkekler ve kadınlar...\"\n" +
                "19. Hem Allah'a ve Resulüne iman edenler ki imanlarının niteliği Bakara Sûresi'nin sonunda ifade edilmişti. Onlar, hep sıddikler ve şehidlerdir. Sıddikler; Allah ve Resulünü tasdik edip, tasdiklerine sadık kalmada en ileri gidenlerdir. \n" +
                "Şehidler; Allah yolunda can veren mücahidlerdir ki, cennetlik olduklarına şehadet edilmiştir. Yahut hakikatte ölmüş olmayıp, hayatta bulunduklarına şehadet edilmiş olmakla beraber henüz hazır demek olan şahidlerdir. \n" +
                "Mümin ve kâfirin ahiretteki hallerini böylece beyan ettikten sonra dünyanın, yani ahiret saadetini kazanmak için sarf edilmeyen fâni hayatın değersizliğini tasvir ederek ahiret hayatına teşvik için buyuruluyor ki:\n" +
                "Meâl-i Şerifi\n" +
                "20. Biliniz ki dünya hayatı bir oyun, bir eğlence, bir süs ve kendi aranızda övünme, mal ve evlat çoğaltma yarışından ibarettir. Bu, tıpkı bir yağmura benzer ki; bitirdiği ot, ekincilerin hoşuna gider, sonra kurur, onu sapsarı görürsün, sonra çerçöp olur. Ahirette ise çetin bir azab; Allah'tan mağfiret ve rıza vardır. Dünya hayatı, aldatıcı bir zevkten başka bir şey değildir.\n" +
                "21. Rabbinizden bir mağfirete; Allah'a ve peygamberine inananlar için hazırlanmış olup, genişliği gökle yerin genişliği kadar olan cennete koşuşun. İşte bu Allah'ın lütfudur. Onu dilediğine verir. Allah büyük lütuf sahibidir.\n" +
                "22. Yeryüzünde vuku bulan ve sizin başınıza gelen herhangi bir musibet yoktur ki biz onu yaratmadan önce, bir kitapta yazılmış olmasın. Şüphesiz bu Allah'a göre kolaydır.\n" +
                "23. Böylece elinizden çıkana üzülmeyesiniz ve Allah'ın size verdiği nimetlerle şımarmayasınız. Çünkü Allah, kendini beğenip böbürlenen kimseleri sevmez.\n" +
                "24. Onlar cimrilik edip insanlara da cimriliği emrederler. Kim yüz çevirirse Allah, zengindir, övgüye layıktır.\n" +
                "25. Andolsun biz peygamberlerimizi açık delillerle gönderdik ve insanların adaleti yerine getirmeleri için beraberlerinde kitabı ve ölçüyü indirdik. Biz demiri de indirdik ki onda büyük bir kuvvet ve insanlar için faydalar vardır. Bu, Allah'ın dinine ve peygamberlerine görmeden yardım edenleri belirlemesi içindir. Şüphesiz Allah kuvvetlidir, daima üstündür.\n" +
                "26- Andolsun, Nuh'u ve İbrahim'i elçi gönderdik, peygamberliği ve kitabı bunların zürriyetleri arasına koyduk. Onlardan yola gelen de vardı, ama onlardan çoğu yoldan çıkmışlardı.\n" +
                "27- Sonra bunların izinden ard arda peygamberlerimizi gönderdik. Meryem oğlu İsa'yı da arkalarından gönderdik, ona İncil'i verdik ve ona uyanların yüreklerine bir şefkat ve merhamet koyduk. Uydurdukları ruhbanlığa gelince onu, biz yazmadık. \n" +
                "Fakat kendileri Allah rızasını kazanmak için yaptılar. Ama buna da gereği gibi uymadılar. Biz de onlardan iman edenlere mükafatlarını verdik. İçlerinden çoğu da yoldan çıkmışlardır.\n" +
                "28- Ey inananlar! Allah'tan korkun, O'nun Resulü'ne inanın ki size rahmetinden iki pay versin, sizin için ışığında yürüyeceğiniz bir nur yaratsın ve sizi bağışlasın. Allah çok bağışlayan, çok merhamet edendir\n" +
                "29- Böylece Kitab ehli, Allah'ın lütfundan hiçbir şey elde edemiyeceklerini bilsinler. Lütuf bütünüyle Allah'ın elindedir, onu dilediğine verir. Allah, büyük lütuf sahibidir.\n" +
                "26. \"Andolsun ki biz Nuh'u ve İbrahim'i gönderdik.\" âyeti \"Andolsun ki biz apaçık delillerle Resullerimizi gönderdik.\" (Hadîd, 57/25) âyetinin bir nevi açıklamasıdır. \n" +
                "Burada bulunan \"vâv\" istinâfiyye (başlangıç), \"Lâm\" lâm-ı muvattıa (cümlede şart mânâsından önce bir kasem geçtiğini bildiren lâm), \"kad\" tahkik içindir. Yani \"Celâlim hakkı için muhakkak biz gönderdik.\" demek gibidir. Bu kuvvetli te'kidler \"vâv\"ın delalet ettiği, takdir edilen bir sualin cevabı ve Resulullah (s.a.v)'ın kitabın dışında bir de kuvvet ve kılıç ile cihada emredilmiş olarak gönderilme sebeplerinin izahı olan bu beyanı takviye etmek ve önemini bildirmek içindir. \n" +
                "Takdir edilen bu sual, sözün gelişinden anlaşıldığına göre şöyledir: Açık mucizelerle Peygamberler gönderilip, beraberlerinde kitab ve mizan indirildikten sonra, insanların adaletle doğrulmaları için bunlar yeterli olmalı değil miydi? O halde bir demirin şiddetli gücü ile faydalarının elde edilmesi için gayret gösterme emri ve onunla uyarıcı yeni bir Resul'ün gönderilmesinin hikmeti nedir? \n" +
                "Böyle iken içlerinden hidayeti kabul eden, doğru yolu tutanlar vardır.\n" +
                " Bununla beraber çokları fasıktırlar, yani doğru yola gelmemiş, yahut doğru yoldan çıkmış; fıskı, âdet haline getirmişlerdir. Demek ki yalnız kitap, insanların insaf ve doğruluğa tutunmaları için yeterli değildir.\n" +
                "27. Bunun böyle olduğunu isbat için de buyuruluyor ki sonra onların peşlerini resûllerimizle takip ettik. Takfiye, esasen ense mânâsını ifade eden kafa kelimesinden alınmış olup, bir kimseyi diğerinin ensesinden, ardı sıra yollamak ve ona kafadar etmek demektir. \n" +
                "Yani bir zaman aralığından sonra o önceden gönderilen resullerin, peygamberlerin peşlerinden kafadarları olmak üzere ardı ardına bir çok peygamber gönderdik ki, Musa (a.s.)dan sonraki Beni İsrail (İsrailoğulları) peygamberleri de bunlara dahildir. \n" +
                "Bir de Meryem oğlu İsa ile takib ettik. Yani o ardı ardına gönderme nihayet İsa (a.s.)'ya kadar geldi, bir de onunla te'kid edildi ve ona İncil'i verdik. Alûsî der ki: \"İsa'ya verilen İncil, bugün hıristiyanların elinde bulunan ve onun doğum kıssası ile uydurulan çarmıha gerilme kıssasını içine alan İnciller değildir.\"\n" +
                "Bugün hıristiyanların elinde resmî olarak Matta, Merkuş, Lûka ve Yuhanna adıyla dört İncil vardır ki isimlerinden ve içindekilerden de anlaşılacağı üzere hepsi sonradan yazılmıştır. Bunlar, Hz. İsa'nın biyoğrafisini anlatan kitaplardır. \n" +
                "Tarihlerin beyanına göre bu dört İncil, Konstantin zamanında ilk oluşturulan Sinod'da birçok İncil içinden seçilmiştir. Nitekim Arapça'ya terceme edilmiş olan \"Barnaba İncil'i\" adındaki resmî olmayan İncil ile diğerleri arasında çok büyük farklar vardır. Sözkonusu bu dört İncil'de Hz. İsa'nın öğütleri çerçevesinde yazılmış olan va'zlar içinde hakiki İncil âyetlerinin mânâlarını ihtiva eden güzel sözler bulunmakta ise de, bunların hepsinin değişime uğradığı birbiriyle mukayesesinden anlaşılacak kadar açıktır. \n" +
                "Ruhbanlık, rahiblerin vasfı demektir. Ki onu onlar icad ettiler, bid'at olarak ilkin kendileri ortaya çıkardılar ve kendileri için lüzumlu saymak istediler. Yani biz onu üzerlerine yazmamıştık. Müstakil olarak farz kılmamış, onunla sorumlu tutmamıştık. Ancak Allah'ın rızasını aramak için kendileri için lüzumlu gördüler. Çünkü Ashab-ı Kehf kıssasında da geçtiği üzere Hz. İsa'nın göğe yükseltilmesinden sonra müminler zorbalar tarafından tazyike uğramış, kaç defa katliama maruz kalarak kırılmışlar, pek az kalmışlardı. \n" +
                "Onun için fitneye düşmekten korkarak dinlerini korumak ve kendilerini samimiyetle ibadete vermek üzere rehbâniyeti seçip dağ başlarına, gizli yerlere çekildiler. Taberî'nin Abdullah b. Mes'ud (r.a.)dan naklettiğine göre Resullullah (s.a.v) buyurmuştur ki: \"Bizden öncekiler yetmiş bir fırkaya ayrıldılar, içlerinden üçü kurtuldu. \n" +
                "Diğerleri helak oldu. Üç fırkadan birisi, meliklerle karşılaştı, Allah'ın dini ve Meryem oğlu İsa'nın dini üzerine onlarla çarpıştılar, melikler onları öldürdüler. Fırkalardan birinin de meliklerle çarpışmaya güçleri yoktu. \n" +
                "Bu yüzden onların kavimleri arasında ikamet edip Allah'ın dinine ve Meryem oğlu İsa'nın dinine davet ediyorlardı, melikler bunları da katlettiler ve bıçkılarla biçtiler. \n" +
                "28. Ey iman edenler! Yani geçen peygamberlere iman edip de verdikleri sözleri tutan ve böylece de mükafata hak kazanan müminler şimdi Allah'tan korkun, o fâsıkların durumuna düşmekten sakının da Resulüne iman edin, yani son gönderdiği Resulü Muhammed Mustafa (s.a.v)'ya iman edin ki size rahmetinden iki pay versin. Birisi, önceki peygamberlere imanın mükafatı, birisi de, Hz. Muhammed'e imanın mükafatı olan iki pay versin.\n" +
                " İbnü Cerir'in Ebu Musa el-Eşari (r.a.)den rivayet ettiği bir hadiste Resulullah (s.a.v) buyurmuştur ki: \"Üç kişi iki kere mükafata nail olurlar: Önceki ve sonraki kitaba iman eden adam, ve bir cariyesi olup da onu güzel bir terbiye ile terbiye ettikten sonra hürriyetine kavuşturup nikahına alan adam, bir de Rabbine güzel ibadet eden ve efendisinin iyiliğini isteyen köle.\" Ve size bir nûr bahşeylesin ki onunla ileri doğru yürüyesiniz. \n" +
                "Burada sözü edilen nur \"Mümin erkeklerle mümin kadınları, önlerinden ve sağlarından nurları koşarken gördüğün günde..\" (Hadid, 57/12) âyetinde açıklanan nurdur. Ve sizi affetsin, geçmişte yapmış olduğunuz günahlarınızı rahmetiyle örtsün. Ve Allah, Gafûr'dur, Rahîm'dir yani fâsık olanlar dahi iman ettikleri takdirde onları da affeder. Mağfiret ve rahmetiyle mükafatlandırır. Onun içindir ki âlemlere rahmet olan Resulünü fazliyle göndermiştir.\n" +
                "29. Kitab ehli bilmeyeceği için mi? Vâhidî demiştir ki: \"Bu âyet müşkildir ve kendisinden önceki âyetle nasıl bir münasebetinin olduğu hakkında müfessirlerin açık bir sözleri yoktur.\n" +
                "\" Tefsircilerin çoğu buradaki nın de (Kıyâme, 75/1) olduğu gibi ziyade olup, mânânın şeklinde müsbet olduğunu söylemişler ve kendisinden önceki âyetle olan irtibatı hususunda bir kaç ihtimal üzerinde durmuşlardır.\n" +
                " Fahrü'r-Razî bunu meşhur bir görüş olarak şöyle özetler: \"Kitab ehli vahiy ve risaletin, kitab ve şeriatın kendilerine mahsus olduğu iddiasında bulundukları cihetle, Allah Teâlâ onların Hz.Muhammed'e iman etmelerini emredip, buna büyük mükafatlar vaad ettikten sonra ardından da, bu âyeti zikretmiştir ki, maksad; nübüvvet faziletinin kendilerine mahsus olduğu inancını kalplerinden gidermektir. Buna göre mânâ şöyledir: \"Bu hitab ve beyan, bu tehdid ve müjde, kitap ehlinin şunu bilmeleri içindir ki...\n" +
                "\" Ebu Müslim İsfahânî gibi bazı müfessirler de yı nefiy mânâsına almakla beraber zamirini Peygamber ve ashabına göndererek kelâmın mânâsına yine müsbet mânâ çıkarmak istemişler ve bu mânâyı şöyle takdir etmişlerdir: \"Bu ihtarı, bu tehdit ve müjdeyi şunun için yaptık ki kitap ehli, Peygamber ve ashabı Allah'ın fazlından bir şeye kadir olamazlar, yani o iki mükafat ve nura, o mağfirete sebep olamazlar diye bir inanca kapılmasınlar, bilakis buna kadir olacaklarını bilsinler. Zira kadir olamazlar diye bilmezlerse, kadir olurlar diye bilmeleri gerekir.\n" +
                "\" Razî bu mânâyı tercih etmiştir. Fakat biz, burada nın zâid olmasını münasip görmediğimiz gibi kitap ehline aid olması açıkça anlaşılan zamirinin Peygamber ve ashabına gönderilmesini de, uygun bulmuyoruz. Bizim kanaatimize göre bu âyet, \"Allah'tan korkun ve Resulü'ne iman edin.\" (Hadid, 57/28) emrine muhalefet ettikleri takdirde kitap ehline bir tehdit mahiyetinde olup kelâm, istifham-ı inkârî mânâsında ve mukadder ye bağlı olarak takdirindedir. \n" +
                "\n";
        tv_tefsiri.setText(fazilet_metin);


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
