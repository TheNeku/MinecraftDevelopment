# 🚀 **CYBERLOGIN** | The Most Secure Authentication Plugin for Minecraft

```
💘 by TheNeku - CyberDevelopment
🌐 Discord: https://discord.akirastudios.eu
🛒 Buy on [McMarket - COMING SOON](https://null.com)
```

---

## 🧭 Table of Contents
- [⚠️ Disclaimer](#️-disclaimer)
- [🙋 What is CyberLogin?](#-what-is-cyberlogin)
- [🔥 Core Features](#-core-features)
- [📖 Wiki & Documentation](#-wiki--documentation)
- [🔧 Technical Specs](#-technical-specs)
- [🌐 Platform Compatibility](#-platform-compatibility)
- [🧾 Commands & Permissions](#-commands--permissions)
- [🈯 Language System](#-language-system)
- [💽 Database Support](#-database-support)
- [🛡️ Admin Tools](#-admin-tools)
- [🧪 Upcoming Features](#-upcoming-features)
- [📦 Licensing](#-licensing)
- [📞 Support](#-support)
- [📘 Setup Wiki](#-setup-wiki)
- [🏁 Final Words](#-final-words)

    

---

## ⚠️ Disclaimer

> CyberLogin is protected under copyright by **Akira Studios** © 2024-2025  
> 🛒 Exclusively distributed via **BuiltByBits**

---

## 🙋 What is CyberLogin?

> ✨ **CyberLogin** is a high-security, modern and feature-rich authentication system.

It’s crafted for **premium & cracked** hybrid networks with:

- Intelligent session & IP tracking
    
- Premium Mojang UUID verification
    
- Secure password flow (with Argon2id)
    
- AutoLogin & multi-language support
    

Compatible with: 🟢 **Velocity**, 🟡 **BungeeCord**, 🔵 **Spigot/Bukkit/Paper**,

---
## 🔥 Core Features

✨ Military-grade security with **Argon2id hashing**  
🛂 **Premium detection** via Mojang's official API  
🔐 Seamless **AutoLogin** for verified UUIDs  
🗨️ Fully customizable **MiniMessage-based messages**  
🗒️ **YAML-only** setup (no database? no problem!)
⚙️ Extensive `config.yml` for deep customization  
🧱 LuckPerms-based unregister protection

---

## 📖 Wiki & Documentation

📘 **Explore the docs:**  
👉 [GitHub Wiki](https://github.com/TheNeku/MinecraftDevelopment/wiki/CyberLogin)  
🎨 [MiniMessage Format](https://docs.advntr.dev/minimessage/format.html)  
🧩 [LuckPerms Wiki](https://luckperms.net/wiki/Home)

🧠 Topics:

- Multi-platform installation (Velocity, Bungee, Spigot)
    
- YAML examples & quick configs
    
- Placeholder formatting
    
- Developer info (v2+)
    
- Advanced permissions & session control

---

## 🔧 Technical Specs

|🔹 Feature|⚙️ Details|
|---|---|
|🔐 Password Security|Argon2id - 4i, 64MB RAM|
|🈯 Language Format|MiniMessage YAML|
|🧾 Config Format|YAML (`config.yml`)|
|💾 DB Support|MySQL, H2 (auto schema)|
|🔌 Platforms|Velocity, Bungee, Spigot, Paper|
|🧩 Permissions System|LuckPerms 5+|
|☕ Java Requirement|Java 17+|

---

## 🌐 Platform Compatibility

|   |   |   |
|---|---|---|
|Feature|Velocity / Bungee|Spigot / Paper|
|🔐 Secure Login/Register|✅|✅|
|🧠 Premium AutoLogin|✅|✅|
|🔁 Server Redirection|✅|❌|
|🧩 IP & Session Management|✅|✅|
|⏱️ Cooldowns & Rate Limiting|✅|✅|
|🧱 Group Weight Checks|✅|✅|

---

## 🧾 Commands & Permissions

|   |   |   |
|---|---|---|
|Command|Description|Permission|
|`/register <pass> <confirm>`|Register a new account|—|
|`/login <password>`|Log in to your account|—|
|`/changepassword <old> <new>`|Update your password|—|
|`/unregister <player>`|Remove user (with permission checks)|`cyberlogin.unregister`|
|`/autologin`|Toggle AutoLogin for premium players|`cyberlogin.autologin`|

🔒 All commands enforce permissions — safe for production!

---

## 🈯 Language System

🌍 Included:

- ᴇɴ English
    
- 🇮🇹 Italiano
    
- 🇫🇷 Français
    
- 🇪🇸 Español
    

📝 Customizable via `lang/messages_xx.yml`  
🎨 Format using [MiniMessage](https://docs.advntr.dev/minimessage/format.html)

---

## 💽 Database Support

|   |   |   |
|---|---|---|
|Feature|MySQL|H2 (Flatfile)|
|Multi-server Support|✅|❌|
|Auto Schema Creation|✅|✅|
|Production Stability|✅|⚠️ Development only|

💾 Passwords are hashed & never stored in plain text!

---

## 🛡️ Admin Tools

🧮 `maxfordepex` → set max group weight to protect important accounts  
🚫 `/unregister` blocked if target exceeds your weight  
📛 Customizable messages for cooldowns, warnings, and permissions  
🧱 Structure ready for logging, API and integration

---

## 🧪 Upcoming Features

🌐 **REST API** for integration  
🧠 **Session Recovery** for ghost logins  
🛰️ **Anti-VPN Detection** (IP trust scoring)  
📊 **Admin Dashboard** (browser-based UI)  
🎯 **PlaceholderAPI Expansion**

---

## 📦 Licensing

🛍️ CyberLogin is launching exclusively on [BuiltByBits](https://builtbybits.com/resources/)  
📜 Licensed under Commercial Use — resale or leaks will be prosecuted.

---

## 📞 Support

💬 Need help? Join the CyberDev Discord:  
🔗 [discord.akirastudios.eu](https://discord.cyberdevelopment.eu)
🐞 Report issues directly on GitHub  
🌍 Translate or expand the wiki — contribute!

---

## 📘 Setup Wiki

🧩 Quickstart Steps:

1️⃣ Drop `CyberLogin.jar` into **proxy and/or backend servers**  
2️⃣ Start server & generate default files  
3️⃣ Edit `config.yml` for:

- Auth/Lobby server names
- Cooldowns, DB, unregister limits 4️⃣ Edit language files `/lang/messages_xx.yml` 5️⃣ Reload or restart
    

⚙️ Optional:

- Setup MySQL for production environments
- Apply weight rules with *LuckPerms*
- Style messages with MiniMessage
    

---

## 🏁 Final Words

```
+ CyberLogin is more than just login security.
+ It's protection, professionalism, and player peace of mind.
+ Fully cross-platform. Fully customizable. Built to scale.
+ If your server deserves quality — it deserves CyberLogin.
```
🛒 Buy on [McMarket](https://null.com)
🛡️ **Thanks for choosing CyberLogin — by TheNeku & Akira Studios** 🩶
