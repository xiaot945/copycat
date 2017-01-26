/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package io.atomix.copycat.protocol.http;

import io.atomix.copycat.Command;

import java.util.Map;

/**
 * HTTP command.
 *
 * @author <a href="http://github.com/kuujo>Jordan Halterman</a>
 */
public class HttpCommand implements HttpOperation, Command<Object> {
  private final String path;
  private final String method;
  private final Map<String, String> headers;
  private final String body;

  public HttpCommand(String path, String method, Map<String, String> headers, String body) {
    this.path = path;
    this.method = method;
    this.headers = headers;
    this.body = body;
  }

  @Override
  public String path() {
    return path;
  }

  @Override
  public String method() {
    return method;
  }

  @Override
  public Map<String, String> headers() {
    return headers;
  }

  @Override
  public String body() {
    return body;
  }
}