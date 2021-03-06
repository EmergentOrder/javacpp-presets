// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow.global;

import org.bytedeco.arrow_dataset.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

public class arrow_dataset extends org.bytedeco.arrow.presets.arrow_dataset {
    static { Loader.load(); }

// Targeting ../../arrow_dataset/DataSourceVector.java


// Targeting ../../arrow_dataset/FileScanOptionsVector.java


// Parsed from arrow/util/iterator.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <type_traits>
// #include <utility>
// #include <vector>

// #include "arrow/status.h"
// #include "arrow/util/functional.h"
// #include "arrow/util/macros.h"
// #include "arrow/util/visibility.h"
// Targeting ../../arrow_dataset/DataFragmentIterator.java


// Targeting ../../arrow_dataset/ScanTaskIterator.java



/** \brief Construct an Iterator which dereferences a (possibly smart) pointer
 *  to invoke its Next function */

/** \brief Construct an Iterator which invokes a callable on Next() */

/** \brief Simple iterator which yields the elements of a std::vector */

/** \brief MapIterator takes ownership of an iterator and a function to apply
 *  on every element. The mapped function is not allowed to fail. */

/** \brief Like MapIterator, but where the function can fail. */

/** \brief FlattenIterator takes an iterator generating iterators and yields a
 *  unified iterator that flattens/concatenates in a single stream. */

  // namespace arrow


// Parsed from arrow/result.h

//
// Copyright 2017 Asylo authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

// Adapted from Asylo

// #pragma once

// #include <string>
// #include <utility>

// #include "arrow/status.h"
// #include "arrow/util/macros.h"
// #include "arrow/util/variant.h"

@Namespace("arrow::internal") public static native void DieWithMessage(@StdString String msg);
@Namespace("arrow::internal") public static native void DieWithMessage(@StdString BytePointer msg);


// Targeting ../../arrow_dataset/ExpressionResult.java



// #define ARROW_ASSIGN_OR_RAISE_IMPL(status_name, lhs, rexpr)
//   auto status_name = (rexpr);
//   ARROW_RETURN_NOT_OK(status_name.status());
//   lhs = std::move(status_name).ValueOrDie();

// #define ARROW_ASSIGN_OR_RAISE_NAME(x, y) ARROW_CONCAT(x, y)

// Executes an expression that returns a Result, extracting its value
// into the variable defined by lhs (or returning on error).
//
// Example: Assigning to an existing value
//   ValueType value;
//   ARROW_ASSIGN_OR_RAISE(value, MaybeGetValue(arg));
//
// WARNING: ASSIGN_OR_RAISE expands into multiple statements; it cannot be used
//  in a single statement (e.g. as the body of an if statement without {})!
// #define ARROW_ASSIGN_OR_RAISE(lhs, rexpr)
//   ARROW_ASSIGN_OR_RAISE_IMPL(ARROW_ASSIGN_OR_RAISE_NAME(_error_or_value, __COUNTER__),
//                              lhs, rexpr);
  // namespace arrow


// Parsed from arrow/dataset/api.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include "arrow/dataset/dataset.h"
// #include "arrow/dataset/discovery.h"
// #include "arrow/dataset/file_base.h"
// #include "arrow/dataset/file_csv.h"
// #include "arrow/dataset/file_feather.h"
// #include "arrow/dataset/filter.h"
// #include "arrow/dataset/scanner.h"


// Parsed from arrow/dataset/visibility.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #if defined(_WIN32) || defined(__CYGWIN__)
// #if defined(_MSC_VER)
// #pragma warning(push)
// #pragma warning(disable : 4251)
// #else
// #pragma GCC diagnostic ignored "-Wattributes"
// #endif

// #ifdef ARROW_DS_STATIC
// #define ARROW_DS_EXPORT
// #elif defined(ARROW_DS_EXPORTING)
// #define ARROW_DS_EXPORT __declspec(dllexport)
// #else
// #define ARROW_DS_EXPORT __declspec(dllimport)
// #endif

// #define ARROW_DS_NO_EXPORT
// #else  // Not Windows
// #ifndef ARROW_DS_EXPORT
// #define ARROW_DS_EXPORT __attribute__((visibility("default")))
// #endif
// #ifndef ARROW_DS_NO_EXPORT
// #define ARROW_DS_NO_EXPORT __attribute__((visibility("hidden")))
// #endif
// #endif  // Non-Windows

// #if defined(_MSC_VER)
// #pragma warning(pop)
// #endif


// Parsed from arrow/dataset/type_fwd.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <vector>

// #include "arrow/dataset/visibility.h"
// #include "arrow/type_fwd.h"  // IWYU pragma: export

  // namespace compute

  // namespace fs
// Targeting ../../arrow_dataset/FieldReferenceExpression.java


// Targeting ../../arrow_dataset/Partition.java


// Targeting ../../arrow_dataset/PartitionKey.java


// Targeting ../../arrow_dataset/PartitionScheme.java


// Targeting ../../arrow_dataset/DatasetWriter.java


// Targeting ../../arrow_dataset/WriteContext.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/dataset.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/util/macros.h"
// Targeting ../../arrow_dataset/DataFragment.java


// Targeting ../../arrow_dataset/SimpleDataFragment.java


// Targeting ../../arrow_dataset/DataSource.java


// Targeting ../../arrow_dataset/SimpleDataSource.java


// Targeting ../../arrow_dataset/Dataset.java


// Targeting ../../arrow_dataset/DataSelector.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/discovery.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

/** Logic for automatically determining the structure of multi-file
 *  dataset with possible partitioning according to available
 *  partition schemes */

// #pragma once

// #include <memory>
// #include <string>

// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/util/macros.h"
// Targeting ../../arrow_dataset/DiscoveryOptions.java



/** \brief Using a root directory */


  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/scanner.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/memory_pool.h"
// Targeting ../../arrow_dataset/ScanContext.java


// Targeting ../../arrow_dataset/ScanOptions.java


// Targeting ../../arrow_dataset/ScanTask.java


// Targeting ../../arrow_dataset/SimpleScanTask.java


// Targeting ../../arrow_dataset/Scanner.java


// Targeting ../../arrow_dataset/SimpleScanner.java


// Targeting ../../arrow_dataset/ScannerBuilder.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/writer.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>
// #include <vector>

// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// Targeting ../../arrow_dataset/WriteOptions.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/file_base.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/buffer.h"
// #include "arrow/dataset/dataset.h"
// #include "arrow/dataset/scanner.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/dataset/writer.h"
// #include "arrow/filesystem/filesystem.h"
// #include "arrow/io/file.h"
// #include "arrow/util/compression.h"
// Targeting ../../arrow_dataset/FileSource.java


// Targeting ../../arrow_dataset/FileScanOptions.java


// Targeting ../../arrow_dataset/FileWriteOptions.java


// Targeting ../../arrow_dataset/FileFormat.java


// Targeting ../../arrow_dataset/FileBasedDataFragment.java


// Targeting ../../arrow_dataset/FileSystemBasedDataSource.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/file_csv.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>

// #include "arrow/csv/options.h"
// #include "arrow/dataset/file_base.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/util/iterator.h"


// Targeting ../../arrow_dataset/CsvScanOptions.java


// Targeting ../../arrow_dataset/CsvWriteOptions.java


// Targeting ../../arrow_dataset/CsvFileFormat.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/file_feather.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>

// #include "arrow/dataset/file_base.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// Targeting ../../arrow_dataset/FeatherScanOptions.java


// Targeting ../../arrow_dataset/FeatherWriterOptions.java


// Targeting ../../arrow_dataset/FeatherFileFormat.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/filter.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>
// #include <utility>

// #include "arrow/compute/kernel.h"
// #include "arrow/compute/kernels/compare.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/result.h"
// #include "arrow/scalar.h"
// Targeting ../../arrow_dataset/FilterType.java


// Targeting ../../arrow_dataset/Filter.java


// Targeting ../../arrow_dataset/ExpressionFilter.java


// Targeting ../../arrow_dataset/ExpressionType.java


// Targeting ../../arrow_dataset/Expression.java


// Targeting ../../arrow_dataset/NotExpressionImpl.java


// Targeting ../../arrow_dataset/OrExpressionImpl.java


// Targeting ../../arrow_dataset/AndExpressionImpl.java


// Targeting ../../arrow_dataset/ComparisonExpressionImpl.java


// Targeting ../../arrow_dataset/UnaryExpression.java


// Targeting ../../arrow_dataset/BinaryExpression.java


// Targeting ../../arrow_dataset/ComparisonExpression.java


// Targeting ../../arrow_dataset/AndExpression.java


// Targeting ../../arrow_dataset/OrExpression.java


// Targeting ../../arrow_dataset/NotExpression.java


// Targeting ../../arrow_dataset/ScalarExpression.java


// Targeting ../../arrow_dataset/FieldExpression.java



@Namespace("arrow::dataset") public static native @SharedPtr AndExpression and_(@SharedPtr Expression lhs,
                                                    @SharedPtr Expression rhs);

@Namespace("arrow::dataset") public static native @ByVal @Name("operator &&") AndExpression and(@Const @ByRef Expression lhs, @Const @ByRef Expression rhs);

@Namespace("arrow::dataset") public static native @SharedPtr OrExpression or_(@SharedPtr Expression lhs,
                                                  @SharedPtr Expression rhs);

@Namespace("arrow::dataset") public static native @ByVal @Name("operator ||") OrExpression or(@Const @ByRef Expression lhs, @Const @ByRef Expression rhs);

@Namespace("arrow::dataset") public static native @SharedPtr NotExpression not_(@SharedPtr Expression operand);

@Namespace("arrow::dataset") public static native @ByVal @Name("operator !") NotExpression not(@Const @ByRef Expression rhs);

// #define COMPARISON_FACTORY(NAME, FACTORY_NAME, OP)
//   inline std::shared_ptr<ComparisonExpression> FACTORY_NAME(
//       const std::shared_ptr<FieldExpression>& lhs,
//       const std::shared_ptr<Expression>& rhs) {
//     return std::make_shared<ComparisonExpression>(compute::CompareOperator::NAME, lhs,
//                                                   rhs);
//   }
// 
//   template <typename T>
//   ComparisonExpression operator OP(const FieldExpression& lhs, T&& rhs) {
//     return ComparisonExpression(compute::CompareOperator::NAME, lhs.Copy(),
//                                 ScalarExpression::Make(std::forward<T>(rhs)));
//   }
@Namespace("arrow::dataset") public static native @SharedPtr ComparisonExpression equal(
      @SharedPtr FieldExpression lhs,
      @SharedPtr Expression rhs);
@Namespace("arrow::dataset") public static native @SharedPtr ComparisonExpression not_equal(
      @SharedPtr FieldExpression lhs,
      @SharedPtr Expression rhs);
@Namespace("arrow::dataset") public static native @SharedPtr ComparisonExpression greater(
      @SharedPtr FieldExpression lhs,
      @SharedPtr Expression rhs);
@Namespace("arrow::dataset") public static native @SharedPtr ComparisonExpression greater_equal(
      @SharedPtr FieldExpression lhs,
      @SharedPtr Expression rhs);
@Namespace("arrow::dataset") public static native @SharedPtr ComparisonExpression less(
      @SharedPtr FieldExpression lhs,
      @SharedPtr Expression rhs);
@Namespace("arrow::dataset") public static native @SharedPtr ComparisonExpression less_equal(
      @SharedPtr FieldExpression lhs,
      @SharedPtr Expression rhs);
// #undef COMPARISON_FACTORY



@Namespace("arrow::dataset") public static native @SharedPtr FieldExpression field_ref(@StdString String name);
@Namespace("arrow::dataset") public static native @SharedPtr FieldExpression field_ref(@StdString BytePointer name);
// clang-format off

  // namespace string_literals

@Namespace("arrow::dataset") public static native @ByVal ExpressionResult SelectorAssume(
    @SharedPtr DataSelector selector,
    @SharedPtr Expression given);

@Namespace("arrow::dataset") public static native @SharedPtr DataSelector ExpressionSelector(
    @SharedPtr Expression e);

  // namespace dataset
  // namespace arrow


}
