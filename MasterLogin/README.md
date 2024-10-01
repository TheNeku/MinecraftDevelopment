# 🚀 MASTERLOGIN

```
💘 by TheNeku - MasterDevelopment
  Discord: discord.mc-master.it
```

## [⚠ DISCLAIMER ⚠]
This Plugin is **FULL CUSTOM** and is protected by *copyright*!
© Mc-Master 2024. All rights reserved.

The plugin is excellent of its kind, as I chose the best classes and since I developed it I have never had a single problem!
I designed this plugin to replace JPremium, which in some places has more than obvious problems!
For now it will be used exclusively on my Minecraft Server, called McMaster, and in this section of my profile you will see all the features and updates of the plugin!
In case you are interested in my minecarft server I invite you to join the [discord](https://discord.gg/mc-master)!
Small thing, I made two versions of the plugin, a Bungeecord, which was simple and a velocity, which was an ordeal, since I had to think of practically all the methods xD  (This however significantly improved the security of the plugin)

## 📊 Features

`SP Logins` Unlike many authentication plugins I found /premium to be useless. Since it is correct that every premium player, even if he has never joined the server, is protected against account fraud. In fact, SP accesses are strictly controlled and a cracked player cannot join the server with a premium username! 

`Sessions and Authentication` After authentication, if the player is recognized as premium a premium session is started, if it is recognized as cracked a cracked session is started. Sessions are created to ensure greater security and to limit actions of cracked players. (I also use it to make it easier to use without having to rewrite a scroll every time)

`Registration and Login` When a player joins the server is sent in auth server, if he is not registered, he will have to register by creating a password that he will have to use to access the server when he joins again (Command /register <password> <password>). This feature protects against account takeovers, especially on an SP server. If the player is already registered he will be asked to authenticate (Command: /login <password>). If a player wants to change the password, he can do it himself without the hassle of opening a ticket on the discord, however he must remember the old one. If you lose access to your account, a staff member can unregister the player (Remember that the unregister is on request and can only be requested by opening tickets on the discord). The /register and /login commands can only be used in the Auth server, while the others only in Lobby!

`Graphical Effects & Autentication Time` To improve the beauty and intuitiveness of use I added chat messages, Titles.
I have also implemented a maximum time in which the player must register, if he does not respect it he will be dislogged. The cooldown is visible from the actionbar.

`IP Check`: If the player connects in a short period of time from two different countries/regions, the account will be flagged to the Staff for checks! In the event of a check, discord may be required, but you can still easily carry out a screenshare check via AnyDesk! In case of bypassing the Anti VPN/Proxy, problems of this type could occur!

`Database Operation` The plugin clearly works via database and is compatible with MySQL and MariaDB. All information is saved on tables reserved for players.

`AutoLogin` Even if there is no /premium, all players who have a premium Minecraft account will be able to take advantage of autologin! Using the /autologin command you can avoid having to log in every time.
In the event of an IP change, the password will still be asked for the first time for greater security.

## 📸 Foto

**Auth**

![register](https://github.com/user-attachments/assets/797ad010-af6f-401f-8539-ffbb3f74c0cc)

![join login](https://github.com/user-attachments/assets/4693b7a5-5143-4a4d-af81-73a69deda953)

