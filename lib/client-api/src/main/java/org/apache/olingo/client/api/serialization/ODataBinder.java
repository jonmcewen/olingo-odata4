/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.client.api.serialization;

import org.apache.olingo.client.api.data.ServiceDocument;
import org.apache.olingo.commons.api.data.Delta;
import org.apache.olingo.commons.api.data.Entity;
import org.apache.olingo.commons.api.data.EntityCollection;
import org.apache.olingo.commons.api.data.Link;
import org.apache.olingo.commons.api.data.Property;
import org.apache.olingo.commons.api.data.ResWrap;
import org.apache.olingo.commons.api.domain.ODataDelta;
import org.apache.olingo.commons.api.domain.ODataEntity;
import org.apache.olingo.commons.api.domain.ODataEntitySet;
import org.apache.olingo.commons.api.domain.ODataLink;
import org.apache.olingo.commons.api.domain.ODataProperty;
import org.apache.olingo.commons.api.domain.ODataServiceDocument;

public interface ODataBinder {

  /**
   * Gets a <tt>EntitySet</tt> from the given OData entity set.
   *
   * @param entitySet OData entity set.
   * @return {@link EntityCollection} object.
   */
  EntityCollection getEntitySet(ODataEntitySet entitySet);

  /**
   * Gets an <tt>Entity</tt> from the given OData entity.
   *
   * @param entity OData entity.
   * @return {@link Entity} object.
   */
  Entity getEntity(ODataEntity entity);

  /**
   * Gets a <tt>Link</tt> from the given OData link.
   *
   * @param link OData link.
   * @return <tt>Link</tt> object.
   */
  Link getLink(ODataLink link);

  /**
   * Gets a <tt>Property</tt> from the given OData property.
   *
   * @param property OData property.
   * @return <tt>Property</tt> object.
   */
  Property getProperty(ODataProperty property);

  /**
   * Adds the given property to the given entity.
   *
   * @param entity OData entity.
   * @param property OData property.
   * @return whether add was successful or not.
   */
  boolean add(ODataEntity entity, ODataProperty property);

  /**
   * Gets <tt>ODataServiceDocument</tt> from the given service document resource.
   *
   * @param resource service document resource.
   * @return <tt>ODataServiceDocument</tt> object.
   */
  ODataServiceDocument getODataServiceDocument(ServiceDocument resource);

  /**
   * Gets <tt>ODataEntitySet</tt> from the given entity set resource.
   *
   * @param resource entity set resource.
   * @return {@link org.apache.olingo.commons.api.domain.ODataEntitySet} object.
   */
  ODataEntitySet getODataEntitySet(ResWrap<EntityCollection> resource);

  /**
   * Gets <tt>ODataEntity</tt> from the given entity resource.
   *
   * @param resource entity resource.
   * @return {@link org.apache.olingo.commons.api.domain.ODataEntity} object.
   */
  ODataEntity getODataEntity(ResWrap<Entity> resource);

  /**
   * Gets an <tt>ODataProperty</tt> from the given property resource.
   *
   * @param resource property resource.
   * @return {@link org.apache.olingo.commons.api.domain.ODataProperty} object.
   */
  ODataProperty getODataProperty(ResWrap<Property> resource);

  ODataDelta getODataDelta(ResWrap<Delta> resource);
}
