
# Pet Store API Testi

Bu projede swagger.io'da yer alan Petstore API'leri kullanılmıştır.

![](C:\Users\ramazan\Desktop\Ramazan_TUYLUOGLU_HW\RamazanTUYLUOGLU_Homeworks\Week2\PostmanApiTests\petstorescreen.png)



### Enviroment

Bu proje için Pet Store Enviroment Dosyası oluşturulmuştur.

Dosya içerisinde tüm methodlarda ortak olarak kullanılan base url ve birçok methodta ortak kullanılan değerler tanımlanmıştır.

![](C:\Users\ramazan\Desktop\Ramazan_TUYLUOGLU_HW\RamazanTUYLUOGLU_Homeworks\Week2\PostmanApiTests\enviroment.PNG)



**Proje içerisinde Pet,Store ve User adında 3 adet klasör yer almaktadır.**



### Pet 

- Add Pet(Post)

```
{{baseUrl}}/pet
```

Post metodu ile veritabanına yeni bir hayvan ekliyoruz.

- Find Pet(Get)

```
{{baseUrl}}pet/findByStatus?status=available
```

Get metodu ile veritabanındaki hayvanları özelliklerine göre aratıyoruz.

- Update and Existing Pet(Put)

```
{{baseUrl}}pet
```

Put metodu ile veritabanında var olan bir hayvanın istediğimiz  değerini değiştiriyoruz.Sadece değişitirilicek değerler yazılır.

- Delete Pet(Del)

```
{{baseUrl}}/pet/100
```

Del metodu ile veritabanından istediğimiz bir hayvanı siliyoruz.

- Pet  not Found(Get)

```
{{baseUrl}}/pet/1
```

Get metodu ile veritabanında var olmayan bir hayvan için istek atıyoruz.

### Store

- Inventories By Status(Get)

```
{{baseUrl}}/store/inventory
```

Get metodu ile veritabanında bulunan envanterleri özelliklerine göre listeliyoruz.

- Add Order(Post)

```
{{baseUrl}}/store/order
```

Post metodu ile veritabanına bir sipariş ekliyoruz.

- List Order(Get)

```
{{baseUrl}}/store/order/11
```

Get metodu ile veritabanındaki bir siparişi çağırıyoruz.

- Order not Found(Get)

```
{{baseUrl}}/store/order/1
```

Get metodu ile veritabanında olmayan bir siparişi çağırıyoruz.

- Delete Order(Del)

```
{{baseUrl}}/store/order/115
```

Del metodu ile veritabanından bir sipariş siliyoruz.

### User

- Create User(Post)

```
{{baseUrl}}/user
```

Post metodu ile veritabanına bir kullanıcı ekliyoruz.

- Create Users With Array(Post)

```
{{baseUrl}}/user/createWithArray	
```

Post metodu ile birden fazla kullanıcıyı aynı anda eklemek için createwithArray isteği atıyoruz. 

- Login(Get)

```
{{baseUrl}}/user/login?username={{userName1}}&password={{password}}
```

Get metodu ile giriş yapıyoruz.

- Logout(Get)

```
{{baseUrl}}/user/logout
```

Get metodu ile çıkış yapıyoruz.

- List User(Get)

```
{{baseUrl}}/user/user1
```

Get metodu ile veritabanındaki kullanıcıları çağırıyoruz.

- Update User(Put)

```
{{baseUrl}}/user/{{userName1}}
```

Put metodu ile kullanıcı güncelliyoruz.

- Delete User(Del)

```
{{baseUrl}}/user/{{userName3}}
```

Del metodu ile veritabanından bir kullanıcı siliyoruz.











