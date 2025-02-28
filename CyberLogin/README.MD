# 🚀 **CYBERLOGIN** | **The Most Secure Authentication Plugin for Minecraft**  

```
💘 by TheNeku - CyberDevelopment 
🌐 Discord: discord.cyberdevelopment.eu 
```

---

## ⚠ **DISCLAIMER**  
🚨 **CyberLogin is a premium plugin, copyrighted © CyberDevelopment 2024-2025.**  
✅ **Exclusively available on BuiltByBits** – Redistribution, decompilation, or unauthorized sharing of the code is strictly prohibited.  

---

# 👉 **Introduction**  

**CyberLogin** is a **multi-platform authentication plugin** designed to protect **premium and cracked** servers with advanced security systems.  
It ensures **account integrity**, **prevents exploits**, and **enhances server security** by leveraging a robust authentication system.  

💡 **CyberLogin is fully compatible with:**  
✅ **Velocity Proxy** *(3.4.0+)*  
✅ **BungeeCord Proxy** *(1.8 - 1.20.4+)*  
✅ **Bukkit / Spigot / Paper** *(1.8 - 1.20.4+)*  

---

## 🔥 **How CyberLogin Works**  

### 🔐 **Authentication System**

1️⃣ Players register with a highly secure **hashed password**. <br>
2️⃣ Returning cracked users **must log in** before gaining access. <br>
3️⃣ **Premium users are verified via Mojang API UUID checks.** *(You can disable premium registration by config.yml.)* <br>
4️⃣ **AutoLogin** enables premium users to join without manual authentication if their Mojang UUID matches the database.


### 🚨 **Security & Exploit Protection**  

✔ Prevents cracked users from using premium usernames (avoiding unauthorized impersonation).<br>
✔ IP-based session tracking (detects suspicious logins & prevents session hijacking).<br>
✔ Anti-VPN System (optional, blocks proxy-based logins to prevent abuse).<br>
✔ Rate-limited login attempts (prevents brute-force attacks by enforcing cooldowns).<br>
✔ Configurable login timeout (disconnects unverified users after X seconds).<br>
✔ Secure database storage.

### 📂 **Configurable Options**
✔ **Fully configurable AuthSystem by config.yml** *(Uploaded in the rep)* **YOU CAN SET EVERYTHING IN THIS PLUGIN xD**<br>
✔ **Fully customizable messages (Supports MiniMessage formatting).**<br>
✔ **Authentication timeout settings (e.g., auto-kick after X seconds).**<br>
✔ **Toggle features like AutoLogin, premium check, and session management.**<br>
✔ **Multi-language support (planned for future updates).**<br>

### 🌍 **Cross-Platform Compatibility**  
CyberLogin **automatically detects the platform** and adjusts its functionality accordingly.  

| **Feature** | **Velocity & BungeeCord** | **Spigot / Bukkit** |
|------------|--------------------------|----------------------|
| Secure Registration/Login | ✅ | ✅ |
| AutoLogin for Premium Players | ✅ | ✅ |
| Automatic Server Switching | ✅ | ❌ *(Not supported)* |
| Session Management | ✅ | ✅ |
| MySQL / H2 Database Support | ✅ | ✅ |
| API Support (PL Integrated) | ✅ | ✅ |

🚨 **Notes:**  
- **Velocity & BungeeCord:** Supports **automatic server switching** after login *(configurable in `config.yml`)*.  
- **Spigot/Bukkit:** Players remain on the same server after authentication.  

---

# 🏆 **Core Features**  

## 👤 **Player Authentication & Security**  <br>
✔ Mojang API verification ensures premium players always log in with their valid UUID.<br>
✔ Cracked players must register with passwords, secured using hashing.<br>
✔ Cracked players cannot impersonate premium users, ensuring a fair and secure environment.<br>

### 🔓 **AutoLogin for Premium Players**  
✔ Mojang authentication removes password requirements for premium players.<br>
✔ UUID-based security prevents unauthorized access.<br>
✔ Fully configurable AutoLogin system by config.yml<br>

---

# ☁ **Database & Storage**  

### 🛠 **MySQL & H2 Support**  
✔ **MySQL** *(multi-server support, recommended for proxy networks)*.  
✔ **H2 Database** *(lightweight, for single-server use)*.  
✔ **Automatic table creation and database setup** *(no manual SQL required!)*.  

---

# 📢 **Commands & Permissions**  

CyberLogin features a **simple yet powerful** command system:

| **Command**               | **Description**                                  | **Permission**           |
|---------------------------|------------------------------------------------|--------------------------|
| `/register <password> <password>` | Register a new account | No permission required |
| `/login <password>` | Log in to an existing account | No permission required |
| `/unregister` | Delete the user’s account (if enabled) | `clogin.unregister` |
| `/changepassword <old> <new>` | Change the user’s password | No permission required |
| `/autologin` | Enable/disable AutoLogin for premium users | `clogin.autologin` |

🚨 **Platform Differences:**  
- **Velocity/BungeeCord:** Commands **must** be executed on the **proxy server**.  
- **Spigot/Bukkit:** Commands **are executed locally** on the **same server**.  

---

# 🛒 **Available Soon on BuiltByBits!**  
💎 **🔗 [BuiltByBits Store - Coming Soon](#) 🔗**  

📢 **Need support? Join our Discord community!**  
🔗 **[discord.cyberdev.eu](https://discord.cyberdevelopment.eu)**  

---

🚀 **🔐 Secure your server today with CyberLogin! 🔥**
