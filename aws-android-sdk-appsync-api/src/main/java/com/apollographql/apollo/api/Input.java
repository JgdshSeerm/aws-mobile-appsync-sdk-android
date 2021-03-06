/**
 * Copyright 2018-2019 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.apollographql.apollo.api;

import javax.annotation.Nullable;

public final class Input<V> {
  public final V value;
  public final boolean defined;

  private Input(V value, boolean defined) {
    this.value = value;
    this.defined = defined;
  }

  public static <V> Input<V> fromNullable(@Nullable V value) {
    return new Input<>(value, true);
  }

  public static <V> Input<V> absent() {
    return new Input<>(null, false);
  }
}
