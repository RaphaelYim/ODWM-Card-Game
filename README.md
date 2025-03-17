# ODWM Card Game

### Modules
This ODWM project was intended to hit as many CS modules as possible, and as such hits:

- **Second Language 2:** This is written in Java.
- **OOP2:** Frequent use of OOP stuff.
- **DDS1:** LinkedList is used in storing Player's hand, field and deck.
- **DDS2:**
  + Stacks used in Cast Effect Resolution
  + Maps used in storing Casting Costs.

---

### Plans

**Timeline Element:** \
Cards will have an additional effect / changed effect depending on the target's place on the timeline.

**Contribution:** \
Will be shown through `Discovery` and `Apparatus` cards. \
Cards may also have numerical references to the scientist's contribution.
Cards will intertwine with the appropriate scientist.

**Important Experiments:** See Contribution.

**Who's Work They Built On / Downfall** \
Cards will have some degree of synergy or interference with the relevant cards.

---

### Acknowledgements 

As of now, ODWM is no where close to completion, as I am doing the entire project in 1 go.
All the needed Abstract classes should now be defined. 
All thats left is creating new cards, implementing their effects, and reworking existing cards to fit what I have planned exactly.
Theres also the need to implement the actual game stages / states. `Upkeep -> Draw -> Main -> Combat -> End`
---

### Reminders For Myself:

- `attackCard(ScientistCard targetCard)`
  + Responsible for destroying self if HP <= 0. 
  + Responsible for destroying target if target HP <= 0.
  + *Effective Only if it is a result of Combat Damage*

---

### To-Do

- When ODWM is completed:
    + Rewrite to follow SOLID.
    + Give Scientist Effect names.

- Errors / Bugs that do not affect compile:
    + Card Effect are at cast-time, not persistent.

- Nerf Coulomb

---

### Card Ideas