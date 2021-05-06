# cs-tech-sinav
lutfen main kisminda bulunan path kismina okunacak dosyanin pathini giriniz. path icinde bulunan "/"'lari "\" ile degistiriniz.
ornek; "C:\Users\Applicant Assesment Test_4_EK_AtFil\board1.txt" yerine  "C:/Users/Applicant Assesment Test_4_EK_AtFil/board1.txt" şeklinde.

puan methodunda taslarin ilk harflerine karsilik gelen sayilari return eden methodu yazdim.
beyaz_at_tehdit mehtodunda beyaz atlarin tehdit ettigi siyah taslarin tablodki yerlerlerine 1 atanmis 2 boyutlu bir dizi return eden bir method yazdim. bunu yaparken
hangi koordinatlarda beyaz at olduguna baktim.bunu yaparken atin hamle yapabiliecegi yerleri hesapladim. bu koordinatlarin tablo sinirlari icinde olup olmadigini kontrol ettim. 
daha sonra hamle yapabilecegi yerler arasinda siyah bir tas aolup olmadigini kontrol ettim. bunun icin hamle yapilabilen yerlerdeki stringin 2. karakterinin s olup olmadigini 
kontrol ettim.

ayni durumun tam tersini siyah_at_tehdit methodu icin uyguladim.

beyaz_fil_tehdit metodunda beyaz atlarin tehdit ettigi siyah taslarin tablodki yerlerlerine 1 atanmis 2 boyutlu bir dizi return eden bir method yazdim. bunun icin hangi
koordinatlarda beyaz fil olduguna baktim. daha sonra hangi koordinatlara gidebilecegini kontrol ettim. eger bu guzergahta siyah bir tas varsa o koordinata 1 degeri atadim.
eger bu guzergahta baska siyah taslar var ise sonra gelenler icin tehdit olusturmadigindan 1 atamadim. bunu break komutuyla yaptim. ayrica guzergah uzerinde siyah bir tastan
once beyaz bir tas var ise beyazdan sonra gelen siyahlar icin tehdit olmadigindan 1 atamadim. 4 yorunge icin ayri ayri durumlari kontrol ettim.

ayni durumun tam tersini siyah_fil_tehdit metodu icin uyguladim.

main methodda ise okunan dosyayi konum isimli 2 boyutlu bir diziye attim. konum dizisinde dosyalardaki gibi indisleri tutmaktadir. burada olusturulan beyaz_kontrol dizisine
siyah_fil_tehdit methodundan return eden diziyi atadim. beyaz_kontrol2 dizisine ise siyah_at_tehdit methodundan donen diziyi atadim. daha sonra bu iki dizinin ayni konumdaki
elemanlarini toplayip beyaz_kontrol_son dizisine atadim. bu sekilde hangi koordinat uzerinde bir beyaz tasa kac tehdit var hesaplamis oldum.

ayni durumun tam tersini siyah taslar icin uyguladim ve siyah_kontrol_son sonucu dizisine atadim.

beyaz_sonuc isimli double degiskene beyaz taslar icin hesaplanan puanı atadim. bunun icin ise beyaz_kontrol_son tablosundaki 0'dan buyuk degerlerin konumunu aldim. ayrica beyaz 
tas kontrolunu de yaptim. tasa karsilik gelen puani 2'ye boldum ve beyaz_sonuca ekledim. tehdit altinda bulunmayan taslaer icin ise beyaz_kontrol_son tablosunda 0'a esit olan 
degerlerin konumunu kullandim. bu degerleri direk beyaz_sonuca ekledim ve ekrana bastirdim.

ayni durumun tam tersini siyah taslar icin uyguladim.

tum degerler gonderilen ornekler ile ayni cikti. sadece board3'te siyahlarin puani 1.5 eksik cikiyor. el ile hesapladigimda da yazdigim programla ayni hesapladim. 
(0.5)+1(1.5)+50+3 = 56
