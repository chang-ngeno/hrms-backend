![Logo](https://github.com/Chang-ngeno/HRMS/blob/master/files/logo.png)

**Human Resources Management System** <br>
(İnsan Kaynakları Yönetim Sistemi) <br><br>
Bu sistem **Latif Yılmaz** tarafından **kodlama.io** yardımıyla yapılmıştır. <br>
Sistemin Backend kısmı **Spring Boot** kullanılarak hazırlanmıştır. <br>
Canlı projeye buradan ulaşabilirsiniz: *https://hrms-kodlamaio.herokuapp.com* <br>
Front-End kodlarına buradan ulaşabilirsiniz: *https://github.com/Chang-ngeno/hrms-frontend* <br><br>
Tüm hakları saklı falan değildir. <br>
💗 ve ☕ ile yapıldı!

### Controllers

<details>
<summary>Abilities Controller</summary>
<br>
  
- getAll
- getById
- getAllByResumeId
- save
- updateById
- delete
- deleteById

</details>

<details>
<summary>Cities Controller</summary>
<br>
  
- getAll
- getById
- getByCityName
- save
- delete
- deleteById

</details>

<details>
<summary>Users Controller</summary>
<br>
  
- getAll
- getById
- getByEmail
- getByEmailAndPassword
- getUserTypeByEmail
- save
- login
- updateEmail
- updatePassword
- updateVerifiedByEmail
- updateVerifiedById
- delete
- deleteById

</details>

<details>
<summary>Employees Controller</summary>
<br>
  
- getAll
- getById
- getByEmail
- getByIdentityNo
- save
- updateById
- delete
- deleteById

</details>

<details>
<summary>Employers Controller</summary>
<br>
  
- getAll
- getById
- getByEmail
- save
- updateById
- delete
- deleteById

</details>

<details>
<summary>Personnels Controller</summary>
<br>
  
- getAll
- getById
- getByEmail
- save
- updateById
- delete
- deleteById

</details>

<details>
<summary>Favorite Jobs Controller</summary>
<br>
  
- getAll
- getById
- getByJobAdvertisementId
- getByJobUserId
- getByJobUserEmail
- save
- updateById
- delete
- deleteById

</details>

<details>
<summary>Images Controller</summary>
<br>
  
- getAll
- getById
- getAllByResumeId
- save
- updateById
- delete
- deleteById

</details>

<details>
<summary>Job Advertisements Controller</summary>
<br>
  
- getAll
- getAllByPage
- getAllByEmployerId
- getAllByEmployerIdOrderByReleaseDateAsc
- getAllByEmployerIdOrderByReleaseDateDesc
- getAllOrderByReleaseDateDesc
- getById
- getByActiveTrue
- getByActiveTrueOrderByReleaseDate
- getByActiveTrueAndEmployerId
- getByActiveTrueAndEmployerIdOrderByReleaseDate
- getByConfirmedTrue
- getByActiveTrueAndConfirmedTrue
- getByActiveTrueAndConfirmedTrueOrderByReleaseDateAsc
- getByActiveTrueAndConfirmedTrueOrderByReleaseDateDesc
- getByFilter
- save
- changeActive

</details>

<details>
<summary>Job Experiences Controller</summary>
<br>
  
- getAll
- getById
- getAllByResumeId
- save
- updateById
- delete
- deleteById

</details>

<details>
<summary>Languages Controller</summary>
<br>
  
- getAll
- getById
- getAllByResumeId
- save
- updateById
- delete
- deleteById

</details>

<details>
<summary>Positions Controller</summary>
<br>
  
- getAll
- getById
- getByPositionName
- save
- updateById
- delete
- deleteById

</details>

<details>
<summary>Resumees Controller</summary>
<br>
  
- getAll
- getById
- getByEmployeeId
- save
- updateById
- delete
- deleteById

</details>

<details>
<summary>Schools Controller</summary>
<br>
  
- getAll
- getById
- getAllByResumeId
- save
- updateById
- delete
- deleteById

</details>

<details>
<summary>Working Tines Controller</summary>
<br>
  
- getAll
- getById
- getByWorkingTimeName
- save
- updateById
- delete
- deleteById

</details>

### Postgresql Diagram
![ERDiagram](https://github.com/Chang-ngeno/HRMS/blob/master/files/ERDiagram.jpg)
