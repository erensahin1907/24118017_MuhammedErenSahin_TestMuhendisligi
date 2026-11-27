
# Sektörde Yazılım Test Mühendisliği

## Öğrenci Bilgileri
- Ad Soyad: Muhammed Eren Şahin
- Öğrenci Numarası: 24118017
- Üniversite: Kapadokya Üniversitesi
- Bölüm: Yazılım Geliştirme

## Projenin Amacı
Bu proje, yapay zekâ desteğiyle otomatik API testlerinin geliştirilmesi ve çalıştırılması amacıyla hazırlanmıştır.

## Kullanılan Teknolojiler
- Java 21
- Apache Maven
- JUnit 5
- REST Assured
- JSONPlaceholder API
- Visual Studio Code
- ChatGPT

## Gerçekleştirilen Testler

### GET Testi
- Endpoint: /posts/1
- Beklenen HTTP durum kodu: 200
- Yanıt içeriğinin doğrulanması
- Yanıt süresinin 5 saniyenin altında olması

### POST Testi
- Endpoint: /posts
- Beklenen HTTP durum kodu: 201
- Yanıt içeriğinin doğrulanması
- Yanıt süresinin 5 saniyenin altında olması

## Testlerin Çalıştırılması
Java 21 ve Maven kurulu olmalıdır.
Proje klasöründe aşağıdaki komut çalıştırılır:

```bash
mvn test
```

## Test Sonuçları

| Açıklama | Sonuç |
|---|---:|
| Toplam test | 2 |
| Başarılı test | 2 |
| Başarısız test | 0 |
| Hata | 0 |
| Başarı oranı | %100 |
| Maven sonucu | BUILD SUCCESS |

## Sunum
Yapay Zekâ Destekli Yazılım Test Mühendisliği konulu 12 slaytlık PowerPoint sunumu proje deposunda bulunmaktadır.

## Yapay Zekâ Kullanımı
Test kodlarının hazırlanması, hata çözümü ve sunumun geliştirilmesi aşamalarında ChatGPT desteğinden yararlanılmıştır.
