# Scripted Souls — Live the Story, Shape the Memory
**Target Platforms:** Android (Mobile/Tablet) + Desktop (Windows/macOS/Linux)  
**Framework:** Kotlin Multiplatform (KMP)  
**Core AI Engine:** Gemini 2.0 Flash Thinking + Custom Narrative State Engine

---

## 1. Executive Summary
**Scripted Souls** is an immersive, AI-powered narrative experience that transforms novels into interactive worlds. Users upload any PDF/ePub, and the system parses its characters, locations, and events. They can then step into the story as an **in-world participant** — interacting with characters, influencing events, and exploring alternate possibilities — while keeping the narrative logically consistent and spoiler-free.

**Key innovations:**
- **Character Authenticity:** Characters know only what they’ve experienced up to a specific page chosen by the user.
- **Narrative Integrity:** Scenes unfold in correct time/place order; impossible meetings or premature revelations are prevented.
- **Personalized Story Editions:** At the end, the user receives their own “lived” version of the novel, where they weren’t the author — they were part of the story.

---

## 2. Core Features

### 2.1 Novel Ingestion & Parsing
- **Supported Formats:** PDF, ePub (DRM-free)
- **Scene Segmentation:** Breaks the novel into discrete, timestamped scenes.
- **Character Recognition:** Uses NLP + entity mapping to detect characters and track their story arcs.
- **Location Mapping:** Identifies all story locations and connects them to specific scenes.
- **Event Timeline:** Constructs a scene-by-scene chronological progression for narrative control.

### 2.2 Immersive Character Chat
- **Knowledge Boundaries:** Characters respond only with in-universe knowledge up to the user’s selected page limit.
- **Authentic Dialogue:** AI models emulate the style, vocabulary, and tone of the original text.
- **Relationship Logic:** User must choose an **in-story identity** — only characters who would canonically know that identity can speak to them.
- **Dynamic Emotional State:** Characters adapt to prior conversations and events, remembering past interactions.

### 2.3 Scene Simulation & Continuity
- **Active Scene Context:**
  - Location (e.g., "Hogwarts Great Hall")
  - In-story date/time (if available)
  - Active events and nearby characters
- **Continuity Rules:**
  - Characters cannot appear outside their known locations.
  - Scene transitions follow the original narrative flow unless altered by user choices.
- **Branch Control:**
  - Player can create small deviations (alternate reactions, actions, or lines of dialogue).
  - Major timeline shifts trigger a “Parallel Story” branch without overwriting the main canon.

### 2.4 Scene Editing & Alternate Reality Mode
- **Post-Scene Editing:** After finishing a scene, users may revise it for creative exploration.
- **Sequential Revision Rule:** Only the most recent scene can be edited to avoid retroactive paradoxes.
- **What-if Exploration:** Create “branch saves” where different outcomes can be replayed.
- **Story Finalization:** At the end, the user can generate their **Personal Edition** — the original novel plus their lived-in alterations, clearly marked as their version.

### 2.5 Narrative Overlay
- **Narrator Voice:** A secondary voice that describes actions, scenery, and unseen details, visible only to the user.
- **Customizable:** Users can rewrite narrator text for roleplay or stylistic preference.
- **Integrated into Story Export:** Narrator additions can appear in the final personalized novel.

---

## 3. Technology Stack

| **Layer** | **Technology** |
|-----------|----------------|
| **Core App** | Kotlin Multiplatform (KMP) targeting Android + Desktop |
| **UI Framework** | Jetpack Compose Multiplatform |
| **AI Engine** | Gemini 2.0 Flash Thinking API |
| **Parsing & NLP** | Custom parser + Named Entity Recognition (NER) |
| **Local Storage** | SQLite or RealmDB for offline narrative state |
| **Cloud Sync** | Firebase/Firestore for cross-device continuity |
| **Media Integration** | Compose Canvas + OpenGL for visuals, OpenAL for ambient audio |
| **Export Engine** | PDF/ePub generator with embedded narrative state |

---

## 4. User Journey

1. **Upload Novel**  
   User selects a PDF/ePub (DRM-free) → Parsing engine processes scenes, characters, and locations.

2. **Set Page Limit**  
   User selects the last accessible page. All AI character responses are locked to this narrative point.

3. **Choose Identity**  
   User selects or creates an in-story persona. Only characters with in-story connections can interact.

4. **Live the Scene**  
   The AI narrates the current scene. The user speaks, acts, or observes, influencing the flow.

5. **Scene Review**  
   Once complete, the scene is stored. User can proceed or explore an alternative variation.

6. **Complete the Story**  
   After all scenes are experienced, the user generates a **Personalized Edition** of the story.

---

## 5. Personalization Features
- **Narrative Perspective:** Switch between first, second, or third person.
- **Tone Matching:** Faithful to author, or adjusted for casual/dramatic preference.
- **Memory Persistence:** Characters recall prior interactions across scenes.
- **Multiple Saves:** Store parallel playthroughs for later review.
- **Export Options:** Final story as PDF/ePub with user’s additions.

---

## 6. Safety & Compliance
- **No DRM Breaking:** Only works with user-owned DRM-free files.
- **Transparent AI Use:** Clearly indicates AI-generated text in exports.
- **Spoiler Protection:** Knowledge boundaries strictly enforced.
- **Parental Controls:** Optional content filter for explicit themes.

---

## 7. Monetization Models
- **Free Tier:** Limited scenes, one save slot, single novel import.
- **Premium Subscription:** Unlimited imports, branching, narrator customization.
- **One-Time Purchase:** Lifetime access to premium features.
- **Add-On Packs:** Curated public domain novels with pre-built enhanced scenes.
- **Community Market:** Optional shared personalized novels (public domain only).

---

## 8. Target Markets
- **Interactive Fiction Enthusiasts**
- **Book Clubs**
- **Education & Literature Studies**
- **Roleplay Communities**
- **Creative Writing Training Tools**

---

## 9. Development Roadmap

**Phase 1 – Core Prototype (Months 1–3)**
- Parsing engine for PDF/ePub
- Basic AI character chat with knowledge cutoff
- Scene display + simple location tracking

**Phase 2 – Immersion Systems (Months 4–6)**
- Scene continuity rules
- Narrator overlay system
- Character relationship logic

**Phase 3 – Branching & Export (Months 7–9)**
- Alternate reality mode
- Scene editing
- Personalized novel export

**Phase 4 – Cross-Platform Launch (Months 10–12)**
- Android + Desktop release
- Cloud sync
- Community features

---

## 10. Vision Statement
> *With Scripted Souls, reading becomes living.  
> Step into the pages, meet the characters,  
> and leave with a story only you could have experienced.*


*White the whitepaper is actually generated with chatgpt, all the ideas, code, etc are mine*