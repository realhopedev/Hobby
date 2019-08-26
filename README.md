[B]For English Users:
I will Publish an English Version of this Plugin in the Future! Don't worry.[/B]

[CENTER][SIZE=7][B][I][FONT=Arial]Hobby[/FONT][/I][/B][/SIZE]
[SIZE=5][FONT=Arial][I][B]das einfache Lobbysystem für Bungeecord[/B][/I]

[B][SIZE=4]Wichtig[/SIZE][/B][SIZE=4]! Dieses Plugin habe ich aus spaß gemacht und habe[/SIZE][/FONT][/SIZE]
[SIZE=5][FONT=Arial][SIZE=4]mich dazu entschieden, es hier zu veröffentlichen. Fehler bitte in[/SIZE][/FONT][/SIZE]
[SIZE=5][FONT=Arial][SIZE=4]die Diskussionen hinzufügen! Danke.[/SIZE][/FONT][/SIZE][/CENTER]

[SIZE=5][FONT=Arial][SIZE=4][B][U]Was kann dieses Plugin?[/U][/B][/SIZE][/FONT][/SIZE]
[SIZE=5][FONT=Arial][SIZE=4]Dieses Plugin ist ein einfaches Lobby System. Es beinhaltet:[/SIZE][/FONT][/SIZE]

[SIZE=5][FONT=Arial][SIZE=4]- Einen Navigationskompass (Konfigurierbar In-Game und in der Konfigurationsdatei [I]items.cfg[/I])[/SIZE][/FONT][/SIZE]
[SIZE=5][FONT=Arial][SIZE=4][IMG]https://i.imgur.com/FPBTCy7.png[/IMG] [/SIZE][/FONT][/SIZE]

[SIZE=5][FONT=Arial][SIZE=4]- Einen /build Befehl, um Spieler Rechte zum bauen in der Lobby zu geben[/SIZE][/FONT][/SIZE]
[SIZE=5][FONT=Arial][SIZE=4][IMG]https://i.imgur.com/88pPAyP.png[/IMG] [/SIZE][/FONT][/SIZE]

[SIZE=5][FONT=Arial][SIZE=4]- Konfigurierbare Nachrichten in der [I]messages.cfg[/I] und eigene Prefix in der[I] config.yml[/I][/SIZE][/FONT][/SIZE]

[SIZE=5][FONT=Arial][SIZE=4][I]- [/I]Join und Leave Nachrichten, die man nach belieben ändern kann.[/SIZE][/FONT][/SIZE]


[SIZE=5][FONT=Arial][SIZE=4][B]Mehr Features werde ich noch hinzufügen in der Zukunft![/B][/SIZE][/FONT][/SIZE]

[SPOILER="Installation"]Um das Plugin zu installieren, einfach in den Plugin Ordner hochladen, Server neustarten und fertig! Man braucht keine anderen Plugins dafür[/SPOILER]
[SPOILER="messages.yml"][/SPOILER][SPOILER="messages.yml"][/spoiler][SPOILER="messages.yml"][/spoiler][SPOILER="messages.yml"]
[code]join-message: "&e%player%&a hat die Lobby betreten"
leave-message: "§e%player%&a hat die Lobby verlassen"
serverswitch: "&aDu wirst in den Server %server% gesendet"
spawn-message: "&aDu wurdest zum Spawn teleportiert!"
build-on: "&aDein Baumodus wurde aktiviert"
build-off: "&aDein Baumodus wurde deaktiviert"
build-on-other: "&aDer Baumodus von %player% wurde aktiviert"
build-off-other: "&aDer Baumodus von %player% wurde deaktiviert"
build-usage: "&cBenutzung: &7/build <Spieler>"
build-notonline: "Spieler %player% nicht gefunden"
build-notallowed: "&cDu darfst nicht bauen!"
build-nopermission: "&cDu bist dazu nicht berechtigt den Baumodus zu aktivieren!"[/code]
[/SPOILER]
[SPOILER="config.yml"][/SPOILER][SPOILER="config.yml"][/spoiler][SPOILER="config.yml"][/spoiler][SPOILER="config.yml"]
[code=YAML]prefix: "&e&lH&r&6obby&7»&f"
join-leave-message: true
menu-name: "&aLobby"
servers:  #Servername des Unterservers, zu den man Teleportiert werden möchte
  1: "Server-1"
  2: "Server-2"
  3: "Server-3"
#Item 4 ist das Spawn Item
  5: "Server-5"
  6: "Server-6"
  7: "Server-7"
spawn:  #Koordinaten des Spawnes
  world: "world"
  x: 0
  y: 0
  z: 0[/code]
[/SPOILER]
[SPOILER="items.yml"][/SPOILER][SPOILER="items.yml"][/spoiler][SPOILER="items.yml"][/spoiler][SPOILER="items.yml"]
[code=YAML]1:
  item: RED_BED
  displayname: "&6&lItem 1"
  lore:
    - "&eDieser Text gehört"
    - "&ezum Item 1"
2:
  item: IRON_SWORD
  displayname: "&6&lItem 2"
  lore:
    - "&eDieser Text gehört"
    - "&ezum Item 2"
3:
  item: GRASS
  displayname: "&6&lItem 3"
  lore:
    - "&eDieser Text gehört"
    - "&ezum Item 3"
4:
  item: NETHER_STAR
  displayname: "&6&lSpawn Item 4"
  lore:
    - "&eDieser Text gehört"
    - "&ezum Item 4"
5:
  item: FEATHER
  displayname: "&6&lItem 5"
  lore:
    - "&eDieser Text gehört"
    - "&ezum Item 5"
6:
  item: FISHING_ROD
  displayname: "&6&lItem 6"
  lore:
    - "&eDieser Text gehört"
    - "&ezum Item 6"
7:
  item: BLAZE_ROD
  displayname: "&6&lItem 7"
  lore:
    - "&eDieser Text gehört"
    - "&ezum Item 7"[/code]
[/SPOILER]
Die Items, die du hinzufügen kannst, findest du [URL='https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Material.html']hier.[/URL]

[SPOILER="Befehle und Rechte"]
[B][I]alle /Hobby Subbefehle: [/I][/B][I]---> hobby.admin
   /hobby set item 1/2/3/4/5/6/7 (Ein Item in der Hand wird gebraucht)
   /hobby set name 1/2/3/4/5/6/7 <ItemName> (Zum ändern des Anzeigename des Items)
   /hobby set spawn (Spawn setzen für das 4. Item)
[/I]
[B]/build [/B][I]---> hobby.build[/I]

[/SPOILER]

[B]Spätere Features:[/B]
- Ändern der Itemplätze
- Ingame-Lorenänderung
- Änderbarer Hintergrund

Wünsche gerne aüßern :)

[I][B]Terms of Service:[/B][/I]
- Du darfst das Plugin nicht decompilen oder modifizieren, melde Fehler einfach bei mir
- Du darfst nicht sagen das dies dein eigenes Plugin ist
- Du darfst nicht Sachen aus diesem Plugin nehmen und für deins verwenden (Ja Nike, ich meine dich)
[I][B]Du brauchst Hilfe? Schreib mich auf Discord an: [/B][/I]Hope#1445
