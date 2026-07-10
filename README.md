Android Week View
=================

[![](https://jitpack.io/v/tlozovyi/Android-Week-View.svg)](https://jitpack.io/#tlozovyi/Android-Week-View)

**Android Week View** is an Android library for displaying highly customizable calendar views within your app.

![](images/screen-shot-new.png)

Features
---------
* Display single-day or multi-day calendar views (day, 3-day, week, and custom ranges)
* All-day events with vertical or horizontal arrangement
* Blocked time ranges alongside regular events
* Extensive styling via XML attributes and per-event `WeekViewEntity.Style`
* Adapter-based API with click, long-click, drag-and-drop, and scroll callbacks
* Simple and paginated adapters (`SimpleAdapter`, `PagingAdapter`)
* Date library modules for `java.time` (JSR-310), Joda-Time, and ThreeTenABP
* Optional emoji support in event titles and subtitles
* Week-aligned scrolling in 7-day mode (`stickToActualWeek`)
* Right-to-left (RTL) layout support
* Multi-day events, custom time ranges, and programmatic scrolling
* Written in Kotlin

Versions (5.4.0)
----------------
| | |
|---|---|
| **Release** | 5.4.0 |
| **minSdk** | 15 (`core`), 21 (`jsr310`) |
| **compileSdk / targetSdk** | 35 |
| **Kotlin** | 2.0.21 |
| **Java bytecode** | 8 |
| **AGP** | 8.6.1 (JDK 17 required to build from source) |

Getting started
---------
* Check out [the wiki](https://github.com/tlozovyi/Android-Week-View/wiki) on how to get started.
* Take a look at the [sample app](https://github.com/tlozovyi/Android-Week-View/tree/master/sample) for more details on how to use `WeekView`.
* See the [changelog](https://github.com/tlozovyi/Android-Week-View/blob/master/CHANGELOG.md) for new functionality and updates to the API.

Dependency
---------
```groovy
implementation 'com.github.tlozovyi.Android-Week-View:core:5.4.0'
```

Optional modules:

```groovy
implementation 'com.github.tlozovyi.Android-Week-View:jsr310:5.4.0'      // java.time (recommended)
implementation 'com.github.tlozovyi.Android-Week-View:jodatime:5.4.0'   // Joda-Time
implementation 'com.github.tlozovyi.Android-Week-View:threetenabp:5.4.0' // ThreeTenABP
implementation 'com.github.tlozovyi.Android-Week-View:emoji:5.4.0'      // Emoji support
```

Add the [JitPack](https://jitpack.io/#tlozovyi/Android-Week-View) repository to your project. See the [wiki](https://github.com/tlozovyi/Android-Week-View/wiki) for full setup instructions.

License
----------

    Copyright 2014 Raquib-ul-Alam

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
