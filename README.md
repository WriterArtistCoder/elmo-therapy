# Elmo Therapy
This Twitter bot replies to mentions of it containing emojis with relevant Elmo GIFs! [@GimmeElmo](https://twitter.com/GimmeElmo) In the future, I might expand to other TV shows and movies, and maybe other social media platforms. **I do not own the right to the Elmo character. This is a parody.**

[![I use the CalVer (http://calver.org) full-year zero-padded-month zero-padded-day versioning scheme.](https://img.shields.io/badge/calver-YYYY.0M.0D-22bfda.svg "I use the CalVer (http://calver.org) YYYY.0M.0D versioning scheme.")](http://calver.org)

I use the [CalVer](http://calver.org) **YYYY.0M.0D versioning** scheme.

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
## Project Structure
* The `gifs` package contains the code for actually taking text and returning a GIF.
* The `twitter` package contains the code for finding Tweets with `@GimmeElmo` in them and replying to them.