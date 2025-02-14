# 🚀 **CYBERLOGIN** | **The Most Secure Authentication Plugin for Minecraft**  

```
💘 **by TheNeku - CyberDevelopment**  
🌐 **Discord:** [discord.cyberdev.eu](https://discord.cyberdev.eu)  
🛒 **Coming soon on BuiltByBits!**  
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
1️⃣ **Cracked users must register** with a secure **BCrypt-hashed password**.  
2️⃣ **Returning cracked users must log in** using their password before they can interact with the server.  
3️⃣ **Premium users are verified** using **Mojang API UUID checks**, eliminating the need for passwords.  
4️⃣ **AutoLogin** is enabled for premium users, allowing seamless entry if their Mojang UUID matches the database.  

### 🚨 **Security & Anti-Exploit**  
✔ **Instant detection of cracked users using premium usernames** *(prevents unauthorized access attempts)*.  
✔ **Advanced AntiVPN system** *(detects suspicious IPs and denies login if necessary)*.  
✔ **Session tracking** *(prevents session hijacking, unauthorized login attempts, and exploit abuse)*.  
✔ **Rate-limited authentication** *(prevents brute-force login attempts by enforcing login delays)*.  
✔ **Customizable login timeout** *(default: 60 seconds, after which players are disconnected if they fail to authenticate)*.  

### 🌍 **Cross-Platform Compatibility**  
CyberLogin **automatically detects the platform** it's running on (Velocity, BungeeCord, or Spigot) and adapts its behavior accordingly.  

| **Feature** | **Velocity & BungeeCord** | **Spigot / Bukkit** |
|------------------------|--------------------------|----------------------|
| Secure Registration/Login | ✅ | ✅ |
| AutoLogin for Premium Players | ✅ | ✅ |
| Automatic Server Switching | ✅ | ❌ *(Not supported)* |
| Session Management | ✅ | ✅ |
| Anti-Spoofing Protection | ✅ | ✅ |
| MySQL / H2 Database Support | ✅ | ✅ |
| PlaceholderAPI Support | ❌ | ✅ |

🚨 **Important Notes:**  
- **Velocity & BungeeCord Versions:** Support **automatic server switching** after login.  
- **Spigot/Bukkit Version:** **Does NOT support server switching** *(players remain on the current server after logging in).*  

---

# 🏆 **Core Features Explained**  

## 👤 **Player Account Management**  
### 🔄 **Premium & Cracked Account Handling**  
✔ **Mojang API verification** ensures that premium players always log in under their valid UUID.  
✔ **Cracked players must create passwords**, stored securely using **BCrypt encryption**.  
✔ **Cracked players cannot impersonate premium usernames** *(if a username is detected as premium, the player must log in through Mojang authentication)*.  

### 🔓 **AutoLogin for Premium Players**  
✔ If a **premium user logs in using their Mojang account**, CyberLogin automatically recognizes them.  
✔ **No password required** for future logins.  
✔ **UUID verification** prevents unauthorized login attempts with premium usernames.  

---

# ☁ **Database & Storage**  

### 🛠 **MySQL & H2 Support**  
✔ **MySQL** *(multi-server support, recommended for Velocity/BungeeCord)*.  
✔ **H2 Database** *(lightweight, local storage for standalone servers - Spigot/Bukkit compatible)*.  
✔ **The plugin automatically creates all necessary tables on first startup** *(no manual database setup required!)*.  

---

# 📢 **Command System & Permissions**  

CyberLogin includes an intuitive command system for **easy account management:**  

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

# 🛒 **Coming Soon to BuiltByBits!**  
💎 **🔗 [BuiltByBits Store - Coming Soon](#) 🔗**

📢 **Need assistance?** Join our Discord community!  
🔗 **[discord.cyberdev.eu](https://discord.cyberdev.eu)**  

---

🚀 **🔐 Secure your server today with CyberLogin! 🔥**
