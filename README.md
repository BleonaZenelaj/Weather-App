## Përshkrimi i aplikacionit

Ideja e aplikacionit Weather app është krijimi i një aplikacioni i cili ju  lejon që me vetëm një shtypje të butonit ta dini se sa është temperatura, lagështia e ajrit, gjërësi dhe gjatësi gjeografike, etj, të një qyteti. Me anë të aplikacionit tonë do të mund të regjistroni (të kyqeni nëse veq e keni krijuar një llogari) dhe të filloni të shkruani emrin e qytetit që doni ta dini temperaturen e tij.

Aplikacioni përdorë openweathermap API i cili është njër nga API më të përdorura për këto lloje të aplikacioneve por edhe një nga API edhe më të sakta sepse e update-on databazën e vet për cdo minutë, ashtu që rezultatet e motit të jenë sa më të sakta të mundshme.

## Teknologjitë e përdorura
Java 1.8.0

Android Studio 4.2.1

## Kërkesat e përgjithshme të projektit

1. Të regjistrohet
2. Pas regjistrimit të futet në aplikacion (Login) 
3. Të shikoj motin në bazë të lokacionit 
4. Për cdo ndryshim të motit, të shfaqet animacioni përkatës

## Kërkesat teknike të projektit

* Më shumë se një aktivitet
	* MainActivity
	* LoginActivity
	* RegisterActivity
* Fragmente dhe menaxhim me ato
	* LoginFragment
	* RegisterFragment
* Përdorimi i API
	* Openweathermap
* Konfigurim të permission në manifest
	* INTERNET
* Së paku një linear, relative dhe constraint layout
* Parsim te JSON
* Së paku një librari të jashtme
	* Picasso - A powerful image downloading and caching library for Android
	* Glide - An image loading and caching library for Android focused on smooth scrolling
* Integrim me një nga shërbimet e firebase
	* Firebase Database
	* Firebase Storage
* Toast dhe Snackbars
* Mainmenu
* Përshtatje për madhësi të ndryshme të ekranit

## Startimi i aplikacionit


|  ![](https://media.giphy.com/media/GlHqE8EdVIhLwSe9bT/giphy.gif) | Second Header | ![](https://media.giphy.com/media/EKl4pqoPZvDU9XI2Us/giphy.gif) |
| :---: | :---: | :---: |
| Regjistrimi i përdoruesit | Kyqja e Përdoruesit  |  Kërkimi i qytetit dhe rezultati  |


### Anëtarët e grupit

[Eldin Veliji](https://github.com/EldinVeliji)

[Bleona Zenelaj](https://github.com/BleonaZenelaj)
