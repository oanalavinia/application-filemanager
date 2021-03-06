/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.filemanager;

import java.util.List;

import org.xwiki.component.annotation.Role;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.stability.Unstable;

/**
 * Represents a folder.
 * 
 * @version $Id$
 * @since 2.0M1
 */
@Role
@Unstable
public interface Folder extends Document
{
    /**
     * @return the reference to the parent folder
     */
    DocumentReference getParentReference();

    /**
     * Sets the parent folder reference.
     * 
     * @param parentReference the reference to the parent folder
     */
    void setParentReference(DocumentReference parentReference);

    /**
     * @return the read-only list of references to the child folders
     */
    List<DocumentReference> getChildFolderReferences();

    /**
     * @return the read-only list of references to the child files
     */
    List<DocumentReference> getChildFileReferences();
}
