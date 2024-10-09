# ⚔️ MASTERKITPVP

```
💘 by TheNeku - MasterDevelopment
  Discord: discord.mc-master.it
```

## [⚠ DISCLAIMER ⚠]
This plugin is FULLY CUSTOM and is protected by copyright! © Mc-Master 2024. All rights reserved.

After utilizing the Velocity API, I ventured into Spigot development! Unlike other plugins, this custom KitPvP encompasses all the features of a game mode within a single plugin, thereby rendering the experience smoother and free from compatibility issues or bugs. Furthermore, it has no dependencies except for the database and Spigot itself. Currently, it is exclusively deployed on my Minecraft server, McMaster. In this section of my profile, you will find all the features and updates of the plugin. If you are interested in my Minecraft server, feel free to join the Discord!

## 📊 Features

### 👤 Player Mechanics

`Currency` A bespoke currency system, devoid of dependencies and seamlessly integrated with all game mechanics. For instance, upon eliminating a player, you receive $200, and $50 as an assist reward. Your balance is visible using the /money command or on the scoreboard.

`Streak` A system that tracks the number of consecutive kills (i.e., without dying) a player achieves. As your streak increases, you are granted bonuses such as enhanced earnings on kills and assists; however, a bounty will be placed on your head. Your streak is displayed on the scoreboard. When a player have an high Number of streak kill and assist have an higher reward (not 200$ and 50$, buy and higher Number depending on the streak.

`Bounty` Bounties serve as an incentive for players to eliminate those with high streaks, thereby redeeming the bounty and earning money. The bounty's value varies according to the player's streak count. The bounties on all players are visible in the Tag and Tablist; if you have a bounty on yourself, it is also displayed on the scoreboard.

`Souls` For each kill, the killer is awarded one soul. Souls are a secondary currency used to trade with sorcerers for items and buffs (note that upon death, items are lost, and streaks are reset).

`Combat` A system that prevents players from logging out during combat with another player. Entering and exiting combat are indicated in the chat, while the cooldown is displayed on the scoreboard. Should a player log out during combat, their inventory will be dropped, and they will be considered dead.

`Gangs` Gangs are teams of up to six players who can collaborate and cannot attack one another. (The maximum number of gang members may be increased as the server's player base grows.)

`Shop` The shop is used to purchase equipment that you'll use to fight other players or simple cosmetics! The currency is $ and prices vary depending on the item!

### 🖥️ Interfaces

`Scoreboards` The scoreboard is designed to be dynamic and intuitive, devoid of flickering or bugs. It adapts when entering combat and if you have a bounty. Below are some images of the scoreboard:

![An6YE87f](https://github.com/user-attachments/assets/3e8fda6a-f7ba-4ffd-a59b-bbcd3b6f19d6)
![An6YE87f](https://github.com/user-attachments/assets/1bfa0f46-c60f-4d35-8b85-3ee0a0760d4f)
![An6YE87f](https://github.com/user-attachments/assets/ae128e39-3eec-4814-b8b2-0f7c868cedcd)

`Tablist` The tablist is crafted using advanced classes deep within Spigot to ensure it remains visually appealing. Here is an image of the tablist:

`Tag & Chat` The tag displays [Gang + Name (color-coded based on LuckPerms rank) + Bounty]. The chat is more comprehensive, including [Gang + Prefix + Name + Bounty].

##### Tag
![An6YE87f](https://github.com/user-attachments/assets/a2b94558-76fc-4531-afbe-5b4484db1d2e)

##### Chat

###### On Combat
![An6YE87f](https://github.com/user-attachments/assets/f40d7d69-231c-40e9-a899-4323ef0ce136)

###### On Streak (Every 5 kills, will appeare a brodcastmessage in chat! Message the message varies depending on the streak) && On Kill:
![An6YE87f](https://github.com/user-attachments/assets/e7a05623-bcba-4752-89f0-fc14a4ae8362)

###### On Bounty Redemption 
![An6YE87f](https://github.com/user-attachments/assets/81941868-37ab-49bb-8bce-183f0ec8849c)


`Holograms` A custom hologram system that facilitates player interaction. They are employed to briefly explain key locations within the spawn area and to display leaderboards. The leaderboards are categorized under Player, which includes Kills, Deaths, Streak, Money, and Gang; however, for Gang, there is only one leaderboard for power. Upon interacting with the hologram, the "Total," "Weekly," and "Daily" leaderboards are displayed. The Holograms location Is saved by ArrayList.

### ☁️ Events

`KOTH` The objective of the KOTH (King of the Hill) event is to remain within a designated area. Each second you occupy the area, you earn a point, and the player who accumulates the most points wins the event. Victorious players can earn money, items, or even VIP status!

`Airdrop` In this event, chests spawn across the map containing loot, which can include items, money, and more. Upon interacting with a chest, it despawns, and the reward is placed directly into your inventory if it's an item, into your balance if it's money, and so forth. If the chest drops an item and your inventory is full, the item is dropped on the ground.

### ❗ Commands

`Gamemode`

![An6YE87f](https://github.com/user-attachments/assets/b3a2b1ea-38bd-4e94-bca1-8883aa04cb22)

`Gang`
P.S. Gang cost 30.000$, if you delete it, you can create a gan every 24 hours

![An6YE87f](https://github.com/user-attachments/assets/68397514-e4d1-4302-8fa5-70a5e8ee392b)

### 🔓 Plugin Extra (not Minecraft)

`Database Operations` All features are stored in the database, and the plugin is fully dependent on it to function correctly. Currently, only MySQL is supported. Without a database connection, the plugin will not operate.


