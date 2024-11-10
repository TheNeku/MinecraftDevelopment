# 🚀 CYBERLOGIN

```
💘 by TheNeku - MasterDevelopment
  Discord: discord.mc-master.it
```

## [⚠ DISCLAIMER ⚠]
This plugin is FULLY CUSTOM, do not redistribute! © CyberDevelopment 2024. All rights reserved.

This plugin stands out in its category, as I carefully selected the best classes and have encountered no issues since its development! I designed this plugin as a replacement for JPremium, which has some notable flaws. It is not currently in use on any server, but in the future I would like to sell it as a valid alternative to other plugins. If you're interested in my development, feel free to join the [discord](https://discord.gg/usbXCnH4AC)!
Just a quick note: I created two versions of the plugin — a BungeeCord version, which was straightforward, and a Velocity version, which was quite challenging xD. The effort, however, greatly improved the plugin's security.

## 📊 Features

`SP Logins` Unlike many authentication plugins, I've found the /premium command to be unnecessary. Every premium player is automatically protected from account theft, even if they have never joined the server. Strict access controls for SP accounts ensure that cracked players cannot join with a premium username. (The verify Is based on Mojang API's

`Sessions and Authentication` Upon authentication, if a player is identified as premium, a premium session is initiated; if identified as cracked, a cracked session is started. Sessions enhance security and limit the actions of cracked players, also making the plugin easier to use without needing to repeatedly input long strings of text.

`Registration and Login` Registration and Login When a player joins the server, they are sent to the authentication server. If they are not registered, they must register by creating a password that will be required for subsequent logins (/register <password> <password>). This feature is designed to protect accounts, especially on SP servers. If a player is already registered, they will be prompted to log in (/login <password>). Should a player wish to change their password, they can do so without needing to open a support ticket on Discord — they must, however, know their old password. In the event of losing access to an account, a staff member can assist by unregistering the player (this can only be requested via a Discord ticket). The /register and /login commands can only be used on the authentication server, while other commands, such as autologin and changepassword, are accessible only from the lobby.

`Graphical Effects & Autentication Time` Time To enhance user experience, I added chat messages and title screens. Additionally, a maximum registration time is enforced; if not respected, the player will be disconnected. A cooldown timer is visible on the action bar.

`IP Check`: If a player connects from two different countries/regions within a short time frame, the account will be flagged for staff review. During a review, Discord may be required for communication, although a screenshare check can also be conducted via AnyDesk. In cases where the Anti VPN/Proxy is bypassed, this feature helps identify potential issues. Please note that the player's IP is not saved to an ArrayList or database to ensure greater security. IP registration is at the player's discretion; they can choose to restrict access to their IP or specific IPs using the /ip command if they wish.

`Database Operation` The plugin operates via a database and is compatible with both MySQL and MariaDB. All player information is saved in designated tables.

`AutoLogin` Even without the /premium command, players with premium Minecraft accounts can benefit from autologin. By using the /autologin command, they can avoid having to log in each time. For added security, if an IP change is detected, the password will be required again on the next login.

## 📸 Foto

**Auth**

![image](https://github.com/user-attachments/assets/dba51fa6-39ec-4080-aafd-57e89b36bbe4)

![image](https://github.com/user-attachments/assets/95c45f33-f00e-4b50-917e-7733f7029476)


