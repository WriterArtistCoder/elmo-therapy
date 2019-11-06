# Elmo Therapy
[![I use the CalVer (https://calver.org) full-year zero-padded-month zero-padded-day versioning scheme.](https://img.shields.io/badge/calver-YYYY.0M.0D-22bfda.svg)](https://calver.org)
[![License: MIT](https://img.shields.io/badge/license-MIT-brightgreen.svg)](https://opensource.org/licenses/MIT)
[![I use Unicode encoding.](https://img.shields.io/badge/encoding-Unicode-informational)](https://home.unicode.org)

This Twitter bot replies to mentions of it containing emojis with relevant Elmo GIFs! [@GimmeElmo](https://twitter.com/GimmeElmo) In the future, I might expand to other TV shows and movies, and maybe other social media platforms. **I do not own the right to the Elmo character. This is a parody.**

The `<version>` tag in Maven is set to the latest released version, or the date when the initial commit was made.
## Dependencies
Twitter4J license:
> Copyright 2007 Yusuke Yamamoto
> 
> Licensed under the Apache License, Version 2.0 (the "License");
> you may not use this file except in compliance with the License.
> You may obtain a copy of the License at
> 
>       http://www.apache.org/licenses/LICENSE-2.0
> 
> Unless required by applicable law or agreed to in writing, software
> Distributed under the License is distributed on an "AS IS" BASIS,
> WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
> See the License for the specific language governing permissions and
> limitations under the License.

([Full license text](LICENSE-OF-DEPENDENCIES.txt))

Google GSON license:
> Copyright 2008 Google Inc.
> 
> Licensed under the Apache License, Version 2.0 (the "License");
> you may not use this file except in compliance with the License.
> You may obtain a copy of the License at
> 
>     http://www.apache.org/licenses/LICENSE-2.0
> 
> Unless required by applicable law or agreed to in writing, software
> distributed under the License is distributed on an "AS IS" BASIS,
> WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
> See the License for the specific language governing permissions and
> limitations under the License.

([Full license text](LICENSE-OF-DEPENDENCIES.txt))

Emoji4J license:
> Copyright 2016 Krishna Chaitanya Thota (kcthota@gmail.com)
> 
> Licensed under the Apache License, Version 2.0 (the "License");
> you may not use this work except in compliance with the License.
> You may obtain a copy of the License in the LICENSE file, or at:
> 
>    http://www.apache.org/licenses/LICENSE-2.0
> 
> Unless required by applicable law or agreed to in writing, software
> distributed under the License is distributed on an "AS IS" BASIS,
> WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
> See the License for the specific language governing permissions and
> limitations under the License.
> 
> [github/gemoji's](https://github.com/github/gemoji) license:
> 
> octocat, squirrel, shipit
> Copyright (c) 2013 GitHub Inc. All rights reserved.
> 
> bowtie, neckbeard, fu
> Copyright (c) 2013 37signals, LLC. All rights reserved.
> 
> feelsgood, finnadie, goberserk, godmode, hurtrealbad, rage 1-4, suspect
> Copyright (c) 2013 id Software. All rights reserved.
> 
> trollface
> Copyright (c) 2013 whynne@deviantart. All rights reserved.
> 
> All other images
> Copyright (c) 2013 Apple Inc. All rights reserved.
> 
> [wooorm/emoticon's](https://github.com/wooorm/emoticon) license:
> 
> Copyright (c) 2014 Titus Wormer <tituswormer@gmail.com>

([Full license text](LICENSE-OF-DEPENDENCIES.txt))
## Project Structure
* The `gifs` package contains the code for actually taking text and returning a GIF.
* The `twitter` package contains the code for finding Tweets with `@GimmeElmo` in them and replying to them.
