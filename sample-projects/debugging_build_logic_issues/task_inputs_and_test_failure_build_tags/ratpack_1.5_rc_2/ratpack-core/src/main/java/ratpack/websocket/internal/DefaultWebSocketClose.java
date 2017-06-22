/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ratpack.websocket.internal;

import ratpack.websocket.WebSocketClose;

public class DefaultWebSocketClose<T> implements WebSocketClose<T> {

  private final boolean fromClient;
  private final T openResult;

  public DefaultWebSocketClose(boolean fromClient, T openResult) {
    this.fromClient = fromClient;
    this.openResult = openResult;
  }

  @Override
  public boolean isFromClient() {
    return fromClient;
  }

  @Override
  public boolean isFromServer() {
    return !fromClient;
  }

  @Override
  public T getOpenResult() {
    return openResult;
  }

}
