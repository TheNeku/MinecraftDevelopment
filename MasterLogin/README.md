# 🚀MASTERLOGIN

```
💘 by TheNeku - MasterDevelopment
  Discord: discord.mc-master.it
```

## [⚠ DISCLAIMER ⚠]
Questo plugin è COMPLETAMENTE CUSTOM ed è protetto da copyright! © Mc-Master 2024. Tutti i diritti riservati.

MasterLogin è un plugin avanzato per la gestione dell'autenticazione, la registrazione dei giocatori e protezioni AntiVPN e AntiExploit su server Minecraft basati su un proxy Velocity.
Questo plugin è progettato per garantire un'esperienza utente sicura e intuitiva, integrandosi perfettamente con sistemi premium e craccati.
Per crea il plugin ho usato la versione base delle VelocityAPI, in caso a qualcuno serva la guida delle API può consultarle [qui](https://jd.papermc.io/velocity/3.4.0/index.html).
Tengo a specificare che non ho usato alcun tipo di verifica via API Velocity, ma verifiche su database interno, oppure via API Mojang (url).
Ricordo che questo, come altri miei plugin, è in uso sul mio server Minecraft: McMaster! Se sei interessato, considera di unirti al [server discord](https://discord.gg/bGb4dph8HC).

## 📊 Features

### 👤 Gestione dei giocatori

`Gestione dei giocatori cracked` Per evitare frodi sugli account premium, il plugin verifica se un giocatore con uno username premium tenta di accedere con un UUID craccato. In tal caso, l'accesso viene bloccato per proteggere il reale proprietario dell'account. Un giocatore è considerato premium solo se sia l'UUID che lo username corrispondono a un account autentico. Questi controlli vengono effettuati sia durante la fase di PreLogin che nella fase di Login.

`Registrazione e Autenticazione` Ogni giocatore deve registrarsi al primo accesso per garantire la sicurezza del proprio account. La registrazione richiede la scelta di una password personale, che sarà necessaria per autenticarsi ad ogni login.
I giocatori premium beneficiano di una protezione avanzata basata sull'UUID, rendendo la password un'ulteriore misura di sicurezza. Tuttavia, per gli account premium, il rischio maggiore è rappresentato da frodi sugli account Microsoft, poiché l'accesso è già protetto dall'UUID.

`AutoLogin` Disponibile esclusivamente per gli utenti premium, questa funzione consente di abilitare l'accesso automatico senza dover inserire ogni volta la password. L'opzione garantisce comunque un elevato livello di sicurezza, poichè i cracked non possono comuqnue accedere ad account premium.

`Timeout di Autenticazione` Implementa un sistema di timeout che disconnette i giocatori se non completano l'autenticazione entro 60 secondi dall'accesso.

`Session Management` Traccia lo stato di login e di invio di packets dei giocatori durante la sessione, garantendo una gestione dinamica delle connessioni e dei packets stessi.

### 🖥️ Interfacce

`Messaggi Personalizzati` Mostra messaggi in chat e action bar per guidare i giocatori attraverso le fasi di registrazione e login.

`Title e Subtitle` Utilizza l'Adventure API per mostrare messaggi dinamici durante l'autenticazione e la registrazione.

## ☁️ Integrazione Database

`Gestione Utenti` Salva le informazioni di login e registrazione nel database. Supporta solo MySQL poichè utilizzo questo database.

`Controllo Premium` Utilizza l'API Mojang per verificare lo stato premium degli utenti e gestire UUID personalizzati per la sicurezza.

## 📸 Foto e Video


### 🔎 Fase di registrazione
https://github.com/user-attachments/assets/dc456d99-9119-4a2e-94e4-2e08cba0db3c

### 🔋 Fase di Login
https://github.com/user-attachments/assets/7a5ef6cb-882a-41b8-ad90-d94ad90b78b8

### 🤖 AutoLogin
https://github.com/user-attachments/assets/b272ea91-a6db-4ef1-b71b-243e9b092f2d

### 🛑 Accesso cracked su account premium
![image](https://github.com/user-attachments/assets/b47f5dc5-6815-47f2-8714-7710bc28aa93)



