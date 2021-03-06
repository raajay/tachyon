/*
 * Licensed to the University of California, Berkeley under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package tachyon.master.lineage.journal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import tachyon.master.journal.JournalEntry;
import tachyon.master.journal.JournalEntryType;

/**
 * This class represents a journal entry for deletion of existing lineage.
 */
public final class DeleteLineageEntry extends JournalEntry {
  private long mLineageId;
  private boolean mCascade;

  /**
   * Creates a new instance of {@link DeleteLineageEntry}.
   *
   * @param lineageId the lineage id
   * @param cascade the cascade flag
   */
  @JsonCreator
  public DeleteLineageEntry(
      @JsonProperty("lineageId") long lineageId,
      @JsonProperty("cascade") boolean cascade) {
    mLineageId = lineageId;
    mCascade = cascade;
  }

  /**
   * @return the lineage id
   */
  @JsonGetter
  public long getLineageId() {
    return mLineageId;
  }

  /**
   * @return the cascade flag
   */
  @JsonGetter
  public boolean isCascade() {
    return mCascade;
  }

  @Override
  public JournalEntryType getType() {
    return JournalEntryType.DELETE_LINEAGE;
  }
}
