# 🚀MASTERLOGIN

```
💘 by TheNeku - MasterDevelopment
  Discord: discord.mc-master.it
```

## [⚠ DISCLAIMER ⚠]
Questo plugin è COMPLETAMENTE CUSTOM ed è protetto da copyright © Mc-Master 2024.
Tutti i diritti sono riservati: è vietata la redistribuzione o condivisione del codice senza autorizzazione.

---

# 👉 Introduzione
**MasterLogin** è un plugin avanzato creato per gestire in maniera sicura:
- **Autenticazione** e **Registrazione** dei giocatori
- **Protezione AntiVPN** e **AntiExploit**
- **Supporto** per server sia *premium* che *cracked*

Il tutto si integra con **Velocity Proxy**, sfruttandone eventi chiave (PreLogin e Login) per garantire controlli approfonditi.

> Nota: il plugin si basa sulle Velocity API (versione base). Se vuoi maggiori dettagli sulle API stesse, visita la documentazione ufficiale:
> https://jd.papermc.io/velocity/3.4.0/index.html  
> Non viene utilizzata alcuna verifica integrata di Velocity (come Auth-API interne), ma controlli su database MySQL e tramite API Mojang.

Se sei interessato a vedere MasterLogin in azione, unisciti al server McMaster Discord:
https://discord.gg/bGb4dph8HC

---

## 📊 Features

### 👤 Gestione dei giocatori

#### Gestione dei giocatori cracked
- Controllo approfondito dell’UUID associato a uno username.
- Se lo username risulta essere di un account premium (verifica via API Mojang), ma sta arrivando con un UUID craccato, l’accesso viene bloccato immediatamente.
- La verifica si svolge sia in PreLogin (controllo preliminare) che in Login (per riconfermare i dati).

#### Registrazione e Autenticazione
- Registrazione obbligatoria al primo accesso:
  il giocatore sceglie una password e la conferma.
- Ad ogni ingresso, viene richiesta la password per confermare l’identità.
- Gli account premium usufruiscono di un controllo aggiuntivo:
  oltre alla password, è presente un vincolo UUID <-> Username: se corrisponde a un profilo Microsoft valido, l’account è segnato come “premium”.

#### AutoLogin
- Disponibile solo per utenti premium verificati.
- Consente al giocatore di saltare l’inserimento della password.
- Non impatta sulla sicurezza: un account cracked non potrà mai usare AutoLogin per entrare in un account premium.

#### Timeout di Autenticazione
- Se il giocatore non completa l’accesso entro 60 secondi, il plugin forza la disconnessione.
- Garantisce che utenti inattivi o bot non restino collegati troppo a lungo in stato di “limbo”.

#### Session Management
- Tiene traccia dello stato di login e dei packets inviati dal giocatore durante la sessione.
- Permette di monitorare e gestire in modo dinamico eventuali richieste sospette, potenziali exploit o la riconnessione di utenti “ibridi”.

---

### 🖥️ Interfacce
- **Messaggi Personalizzati**:
  vengono mostrati in chat e in action bar,
  fornendo istruzioni chiare per registrazione e login.
- **Title e Subtitle**:
  utilizza la Adventure API di Velocity per mostrare messaggi in overlay sullo schermo,
  utili per avvisi immediati durante l’autenticazione e la registrazione.

---

## ☁️ Integrazione Database

### Gestione Utenti
- I dati di login (username, password, flag premium, IP ecc.) vengono salvati in MySQL.
- **Tabella Principale** (esempio):
    CREATE TABLE IF NOT EXISTS `masterlogin_users` (
        `id` INT AUTO_INCREMENT PRIMARY KEY,
        `username` VARCHAR(16) NOT NULL,
        `uuid` VARCHAR(36) NOT NULL,
        `password_hash` VARCHAR(255) NOT NULL,
        `premium` BOOLEAN DEFAULT FALSE,
        `last_ip` VARCHAR(45) DEFAULT NULL,
        `register_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

### Controllo Premium
- Durante la fase di registrazione o al primo login, il plugin interroga le API Mojang
  usando una GET su:
  https://api.mojang.com/users/profiles/minecraft/<username>
- Se la risposta fornisce un UUID valido, il campo `premium` nel database viene segnato come TRUE.
- Anche nelle sessioni successive, il plugin verifica la coerenza di UUID e username con quelli di Mojang.

---

## 📸 Foto e Video

### 🔎 Fase di registrazione
https://github.com/user-attachments/assets/dc456d99-9119-4a2e-94e4-2e08cba0db3c

### 🔋 Fase di Login
https://github.com/user-attachments/assets/7a5ef6cb-882a-41b8-ad90-d94ad90b78b8

### 🤖 AutoLogin
https://github.com/user-attachments/assets/b272ea91-a6db-4ef1-b71b-243e9b092f2d

### 🛑 Accesso cracked su account premium
https://github.com/user-attachments/assets/b47f5dc5-6815-47f2-8714-7710bc28aa93

---

## ⚙ Tecnologie Utilizzate
- **Linguaggio**: Java 17
- **Framework Proxy**: Velocity (3.4.0)
- **Adventure API**: Per i messaggi Title e Subtitle
- **MySQL**: Per la persistenza dei dati
- **Mojang API**: Per verifiche premium

---

## ✅ Conclusione
**MasterLogin** si propone come soluzione completa per l’autenticazione su server basati su Velocity, con attenzione a:
- Sicurezza (AntiVPN, AntiExploit, blocco accessi sospetti)
- Flessibilità (supporta premium & cracked)
- Esperienza Utente (messaggi chiari e sistema AutoLogin)

Se vuoi assistere a tutte queste funzionalità in azione, ti aspettiamo sul server McMaster e nella community Discord:
https://discord.gg/bGb4dph8HC

> Ricorda: Questo plugin è privato e non è distribuito pubblicamente. Tutti i diritti riservati.
> Può essere visionato ma non usato o copiato su altri server senza consenso dell’autore.

**Buon divertimento e buona sicurezza con MasterLogin!**