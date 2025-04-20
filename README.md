# 🛡️ Ironman Questing Helper by Az
_A plugin built for perfectionist Ironmen, by Dev_Az_

A RuneLite plugin to guide Ironman accounts through the **most optimal progression route**, pulling strategies from multiple expert sources — not just the OSRS Wiki.

This is not a general-purpose Quest Helper — it’s focused on **early account optimization** for Ironman accounts, ensuring no crucial steps are missed.

---

## 🚀 Features

- 📋 Step-by-step quest and skilling checklist for new Ironman accounts
- 🧭 Overlay displays progression steps live in-game
- ✅ Loads data from `quest_steps.json` in `/resources`
- 🔁 Easily extensible structure for future dynamic tracking
- 🛠️ No backend or server dependency

---

## 📁 File Structure

| File | Purpose |
|------|---------|
| `IronmanQuestingPlugin.java` | Main plugin controller (startup/shutdown) |
| `IronmanQuestingOverlay.java` | Overlay renderer using JSON steps |
| `IronmanQuestingConfig.java` | Empty config (required by RuneLite) |
| `quest_steps.json` | List of ordered steps (loaded at runtime) |
| `IronmanQuestingPluginTest.java` | Unit test to verify startup logic |

---

## 🧪 Testing

This plugin includes working unit tests using **JUnit + Mockito** to ensure safe load behavior.

### ✅ Run tests:
```bash
./gradlew test
```

### ✅ Expected Output:
```
[IronmanQuestingPlugin] 🔧 Ironman Questing Helper started
✅ Plugin startup completed successfully

BUILD SUCCESSFUL
```

Tests are located at:  
`src/test/java/com/devaz/ironmanquesting/IronmanQuestingPluginTest.java`

---

## ⚙️ Integration Notes

- No client state is modified.
- The plugin works even if not logged in.
- JSON loading failure is caught and safely logged (no crash).
- Steps are rendered in a fixed panel at `TOP_LEFT`.

---

## 🔄 Future Plans

- [ ] In-game tracking of step completions
- [ ] Multiple quest path profiles (e.g. HCIM, UIM, Group)
- [ ] Dynamic branching based on account type or quest decisions
- [ ] GitHub-based crowd contribution of step routes

---

## 📌 Plugin Manifest

```json
{
  "internalName": "ironmanquesting",
  "displayName": "Ironman Questing Helper",
  "description": "A plugin that helps new Ironman accounts complete quests efficiently",
  "tags": ["ironman", "quest", "helper"],
  "category": "Utility",
  "creator": "Dev_Az",
  "version": "0.1"
}
```

---

## 🧠 Acknowledgements

Inspired by:  
- [ironman.guide](https://ironman.guide)  
- OSRS community theorycrafters  
- RuneLite Plugin Hub guidelines

---

## 🙋 Contact

If you have suggestions, feedback, or would like to contribute to quest step data:

📨 **Discord:** `Azerate`  
🐙 **GitHub:** [github.com/Az3rate](https://github.com/Az3rate)

---

*Thank you for reviewing! Hope this plugin provides real value to the Ironman community!*