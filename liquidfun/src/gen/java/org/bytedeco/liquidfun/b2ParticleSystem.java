// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;



@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ParticleSystem extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2ParticleSystem(Pointer p) { super(p); }

	/** Create a particle whose properties have been defined.
	 *  No reference to the definition is retained.
	 *  A simulation step must occur before it's possible to interact with a
	 *  newly created particle.  For example, DestroyParticleInShape() will
	 *  not destroy a particle until b2World::Step() has been called.
	 *  \warning This function is locked during callbacks.
	 *  @return the index of the particle. */
	public native @Cast("int32") int CreateParticle(@Const @ByRef b2ParticleDef def);

	/** Retrieve a handle to the particle at the specified index.
	 *  Please see #b2ParticleHandle for why you might want a handle. */
	public native @Const b2ParticleHandle GetParticleHandleFromIndex(@Cast("const int32") int index);

	/** Destroy a particle.
	 *  The particle is removed after the next simulation step (see
	 *  b2World::Step()). */
	public native void DestroyParticle(@Cast("int32") int index);

	/** Destroy a particle.
	 *  The particle is removed after the next step.
	 *  @param Index of the particle to destroy.
	 *  @param Whether to call the destruction listener just before the
	 *  particle is destroyed. */
	public native void DestroyParticle(@Cast("int32") int index, @Cast("bool") boolean callDestructionListener);

	/** Destroy the Nth oldest particle in the system.
	 *  The particle is removed after the next b2World::Step().
	 *  @param Index of the Nth oldest particle to destroy, 0 will destroy the
	 *  oldest particle in the system, 1 will destroy the next oldest
	 *  particle etc.
	 *  @param Whether to call the destruction listener just before the
	 *  particle is destroyed. */
	public native void DestroyOldestParticle(@Cast("const int32") int index,
								   @Cast("const bool") boolean callDestructionListener);

	/** Destroy particles inside a shape without enabling the destruction
	 *  callback for destroyed particles.
	 *  This function is locked during callbacks.
	 *  For more information see
	 *  DestroyParticleInShape(const b2Shape&, const b2Transform&,bool).
	 *  @param Shape which encloses particles that should be destroyed.
	 *  @param Transform applied to the shape.
	 *  \warning This function is locked during callbacks.
	 *  @return Number of particles destroyed. */
	public native @Cast("int32") int DestroyParticlesInShape(@Const @ByRef b2Shape shape, @Const @ByRef b2Transform xf);

	/** Destroy particles inside a shape.
	 *  This function is locked during callbacks.
	 *  In addition, this function immediately destroys particles in the shape
	 *  in constrast to DestroyParticle() which defers the destruction until
	 *  the next simulation step.
	 *  @param Shape which encloses particles that should be destroyed.
	 *  @param Transform applied to the shape.
	 *  @param Whether to call the world b2DestructionListener for each
	 *  particle destroyed.
	 *  \warning This function is locked during callbacks.
	 *  @return Number of particles destroyed. */
	public native @Cast("int32") int DestroyParticlesInShape(@Const @ByRef b2Shape shape, @Const @ByRef b2Transform xf,
		                              @Cast("bool") boolean callDestructionListener);

	/** Create a particle group whose properties have been defined. No
	 *  reference to the definition is retained.
	 *  \warning This function is locked during callbacks. */
	public native b2ParticleGroup CreateParticleGroup(@Const @ByRef b2ParticleGroupDef def);

	/** Join two particle groups.
	 *  @param the first group. Expands to encompass the second group.
	 *  @param the second group. It is destroyed.
	 *  \warning This function is locked during callbacks. */
	public native void JoinParticleGroups(b2ParticleGroup groupA, b2ParticleGroup groupB);

	/** Split particle group into multiple disconnected groups.
	 *  @param the group to be split.
	 *  \warning This function is locked during callbacks. */
	public native void SplitParticleGroup(b2ParticleGroup group);

	/** Get the world particle group list. With the returned group, use
	 *  b2ParticleGroup::GetNext to get the next group in the world list.
	 *  A NULL group indicates the end of the list.
	 *  @return the head of the world particle group list. */
	public native b2ParticleGroup GetParticleGroupList();

	/** Get the number of particle groups. */
	public native @Cast("int32") int GetParticleGroupCount();

	/** Get the number of particles. */
	public native @Cast("int32") int GetParticleCount();

	/** Get the maximum number of particles. */
	public native @Cast("int32") int GetMaxParticleCount();

	/** Set the maximum number of particles.
	 *  A value of 0 means there is no maximum. The particle buffers can
	 *  continue to grow while b2World's block allocator still has memory.
	 *  Note: If you try to CreateParticle() with more than this count,
	 *  b2_invalidParticleIndex is returned unless
	 *  SetDestructionByAge() is used to enable the destruction of the
	 *  oldest particles in the system. */
	public native void SetMaxParticleCount(@Cast("int32") int count);

	/** Get all existing particle flags. */
	public native @Cast("uint32") long GetAllParticleFlags();

	/** Get all existing particle group flags. */
	public native @Cast("uint32") long GetAllGroupFlags();

	/** Pause or unpause the particle system. When paused, b2World::Step()
	 *  skips over this particle system. All b2ParticleSystem function calls
	 *  still work.
	 *  @param paused is true to pause, false to un-pause. */
	public native void SetPaused(@Cast("bool") boolean paused);

	/** @return true if the particle system is being updated in
	 *  b2World::Step().
	 *  Initially, true, then, the last value passed into SetPaused(). */
	public native @Cast("bool") boolean GetPaused();

	/** Change the particle density.
	 *  Particle density affects the mass of the particles, which in turn
	 *  affects how the particles interact with b2Bodies. Note that the density
	 *  does not affect how the particles interact with each other. */
	public native void SetDensity(@Cast("float32") float density);

	/** Get the particle density. */
	public native @Cast("float32") float GetDensity();

	/** Change the particle gravity scale. Adjusts the effect of the global
	 *  gravity vector on particles. */
	public native void SetGravityScale(@Cast("float32") float gravityScale);

	/** Get the particle gravity scale. */
	public native @Cast("float32") float GetGravityScale();

	/** Damping is used to reduce the velocity of particles. The damping
	 *  parameter can be larger than 1.0f but the damping effect becomes
	 *  sensitive to the time step when the damping parameter is large. */
	public native void SetDamping(@Cast("float32") float damping);

	/** Get damping for particles */
	public native @Cast("float32") float GetDamping();

	/** Change the number of iterations when calculating the static pressure of
	 *  particles. By default, 8 iterations. You can reduce the number of
	 *  iterations down to 1 in some situations, but this may cause
	 *  instabilities when many particles come together. If you see particles
	 *  popping away from each other like popcorn, you may have to increase the
	 *  number of iterations.
	 *  For a description of static pressure, see
	 *  http://en.wikipedia.org/wiki/Static_pressure#Static_pressure_in_fluid_dynamics */
	public native void SetStaticPressureIterations(@Cast("int32") int iterations);

	/** Get the number of iterations for static pressure of particles. */
	public native @Cast("int32") int GetStaticPressureIterations();

	/** Change the particle radius.
	 *  You should set this only once, on world start.
	 *  If you change the radius during execution, existing particles may
	 *  explode, shrink, or behave unexpectedly. */
	public native void SetRadius(@Cast("float32") float radius);

	/** Get the particle radius. */
	public native @Cast("float32") float GetRadius();

	/** Get the position of each particle
	 *  Array is length GetParticleCount()
	 *  @return the pointer to the head of the particle positions array. */
	public native b2Vec2 GetPositionBuffer();

	/** Get the velocity of each particle
	 *  Array is length GetParticleCount()
	 *  @return the pointer to the head of the particle velocities array. */
	public native b2Vec2 GetVelocityBuffer();

	/** Get the color of each particle
	 *  Array is length GetParticleCount()
	 *  @return the pointer to the head of the particle colors array. */
	public native b2ParticleColor GetColorBuffer();

	/** Get the particle-group of each particle.
	 *  Array is length GetParticleCount()
	 *  @return the pointer to the head of the particle group array. */
	public native @Cast("b2ParticleGroup*const*") PointerPointer GetGroupBuffer();

	/** Get the weight of each particle
	 *  Array is length GetParticleCount()
	 *  @return the pointer to the head of the particle positions array. */
	public native @Cast("float32*") FloatPointer GetWeightBuffer();

	/** Get the user-specified data of each particle.
	 *  Array is length GetParticleCount()
	 *  @return the pointer to the head of the particle user-data array. */
	public native @Cast("void**") PointerPointer GetUserDataBuffer();

	/** Get the flags for each particle. See the b2ParticleFlag enum.
	 *  Array is length GetParticleCount()
	 *  @return the pointer to the head of the particle-flags array. */
	public native @Cast("const uint32*") IntPointer GetFlagsBuffer();

	/** Set flags for a particle. See the b2ParticleFlag enum. */
	public native void SetParticleFlags(@Cast("int32") int index, @Cast("uint32") long flags);
	/** Get flags for a particle. See the b2ParticleFlag enum. */
	
	///
	///
	public native @Cast("uint32") long GetParticleFlags(@Cast("const int32") int index);

	/** Set an external buffer for particle data.
	 *  Normally, the b2World's block allocator is used for particle data.
	 *  However, sometimes you may have an OpenGL or Java buffer for particle
	 *  data. To avoid data duplication, you may supply this external buffer.
	 * 
	 *  Note that, when b2World's block allocator is used, the particle data
	 *  buffers can grow as required. However, when external buffers are used,
	 *  the maximum number of particles is clamped to the size of the smallest
	 *  external buffer.
	 * 
	 *  @param buffer is a pointer to a block of memory.
	 *  @param size is the number of values in the block. */
	public native void SetFlagsBuffer(@Cast("uint32*") IntPointer buffer, @Cast("int32") int _capacity);
	public native void SetFlagsBuffer(@Cast("uint32*") IntBuffer buffer, @Cast("int32") int _capacity);
	public native void SetFlagsBuffer(@Cast("uint32*") int[] buffer, @Cast("int32") int _capacity);
	public native void SetPositionBuffer(b2Vec2 buffer, @Cast("int32") int _capacity);
	public native void SetVelocityBuffer(b2Vec2 buffer, @Cast("int32") int _capacity);
	public native void SetColorBuffer(b2ParticleColor buffer, @Cast("int32") int _capacity);
	public native void SetUserDataBuffer(@Cast("void**") PointerPointer buffer, @Cast("int32") int _capacity);
	public native void SetUserDataBuffer(@Cast("void**") @ByPtrPtr Pointer buffer, @Cast("int32") int _capacity);

	/** Get contacts between particles
	 *  Contact data can be used for many reasons, for example to trigger
	 *  rendering or audio effects. */
	public native @Const b2ParticleContact GetContacts();
	public native @Cast("int32") int GetContactCount();

	/** Get contacts between particles and bodies
	 *  Contact data can be used for many reasons, for example to trigger
	 *  rendering or audio effects. */
	public native @Const b2ParticleBodyContact GetBodyContacts();
	public native @Cast("int32") int GetBodyContactCount();

	/** Get array of particle pairs. The particles in a pair:
	 *    (1) are contacting,
	 *    (2) are in the same particle group,
	 *    (3) are part of a rigid particle group, or are spring, elastic,
	 *        or wall particles.
	 *    (4) have at least one particle that is a spring or barrier
	 *        particle (i.e. one of the types in k_pairFlags),
	 *    (5) have at least one particle that returns true for
	 *        ConnectionFilter::IsNecessary,
	 *    (6) are not zombie particles.
	 *  Essentially, this is an array of spring or barrier particles that
	 *  are interacting. The array is sorted by b2ParticlePair's indexA,
	 *  and then indexB. There are no duplicate entries. */
	public native @Const b2ParticlePair GetPairs();
	public native @Cast("int32") int GetPairCount();

	/** Get array of particle triads. The particles in a triad:
	 *    (1) are in the same particle group,
	 *    (2) are in a Voronoi triangle together,
	 *    (3) are within b2_maxTriadDistance particle diameters of each
	 *        other,
	 *    (4) return true for ConnectionFilter::ShouldCreateTriad
	 *    (5) have at least one particle of type elastic (i.e. one of the
	 *        types in k_triadFlags),
	 *    (6) are part of a rigid particle group, or are spring, elastic,
	 *        or wall particles.
	 *    (7) are not zombie particles.
	 *  Essentially, this is an array of elastic particles that are
	 *  interacting. The array is sorted by b2ParticleTriad's indexA,
	 *  then indexB, then indexC. There are no duplicate entries. */
	public native @Const b2ParticleTriad GetTriads();
	public native @Cast("int32") int GetTriadCount();

	/** Set an optional threshold for the maximum number of
	 *  consecutive particle iterations that a particle may contact
	 *  multiple bodies before it is considered a candidate for being
	 *  "stuck". Setting to zero or less disables. */
	public native void SetStuckThreshold(@Cast("int32") int iterations);

	/** Get potentially stuck particles from the last step; the user must
	 *  decide if they are stuck or not, and if so, delete or move them */
	public native @Cast("const int32*") IntPointer GetStuckCandidates();

	/** Get the number of stuck particle candidates from the last step. */
	public native @Cast("int32") int GetStuckCandidateCount();

	/** Compute the kinetic energy that can be lost by damping force */
	public native @Cast("float32") float ComputeCollisionEnergy();

	/** Set strict Particle/Body contact check.
	 *  This is an option that will help ensure correct behavior if there are
	 *  corners in the world model where Particle/Body contact is ambiguous.
	 *  This option scales at n*log(n) of the number of Particle/Body contacts,
	 *  so it is best to only enable if it is necessary for your geometry.
	 *  Enable if you see strange particle behavior around b2Body
	 *  intersections. */
	public native void SetStrictContactCheck(@Cast("bool") boolean enabled);
	/** Get the status of the strict contact check. */
	public native @Cast("bool") boolean GetStrictContactCheck();

	/** Set the lifetime (in seconds) of a particle relative to the current
	 *  time.  A lifetime of less than or equal to 0.0f results in the particle
	 *  living forever until it's manually destroyed by the application. */
	public native void SetParticleLifetime(@Cast("const int32") int index, @Cast("const float32") float lifetime);
	/** Get the lifetime (in seconds) of a particle relative to the current
	 *  time.  A value > 0.0f is returned if the particle is scheduled to be
	 *  destroyed in the future, values <= 0.0f indicate the particle has an
	 *  infinite lifetime. */
	public native @Cast("float32") float GetParticleLifetime(@Cast("const int32") int index);

	/** Enable / disable destruction of particles in CreateParticle() when
	 *  no more particles can be created due to a prior call to
	 *  SetMaxParticleCount().  When this is enabled, the oldest particle is
	 *  destroyed in CreateParticle() favoring the destruction of particles
	 *  with a finite lifetime over particles with infinite lifetimes.
	 *  This feature is enabled by default when particle lifetimes are
	 *  tracked.  Explicitly enabling this feature using this function enables
	 *  particle lifetime tracking. */
	public native void SetDestructionByAge(@Cast("const bool") boolean enable);
	/** Get whether the oldest particle will be destroyed in CreateParticle()
	 *  when the maximum number of particles are present in the system. */
	public native @Cast("bool") boolean GetDestructionByAge();

	/** Get the array of particle expiration times indexed by particle index.
	 *  GetParticleCount() items are in the returned array. */
	public native @Cast("const int32*") IntPointer GetExpirationTimeBuffer();
	/** Convert a expiration time value in returned by
	 *  GetExpirationTimeBuffer() to a time in seconds relative to the
	 *  current simulation time. */
	public native @Cast("float32") float ExpirationTimeToLifetime(@Cast("const int32") int expirationTime);
	/** Get the array of particle indices ordered by reverse lifetime.
	 *  The oldest particle indexes are at the end of the array with the
	 *  newest at the start.  Particles with infinite lifetimes
	 *  (i.e expiration times less than or equal to 0) are placed at the start
	 *   of the array.
	 *  ExpirationTimeToLifetime(GetExpirationTimeBuffer()[index])
	 *  is equivalent to GetParticleLifetime(index).
	 *  GetParticleCount() items are in the returned array. */
	public native @Cast("const int32*") IntPointer GetIndexByExpirationTimeBuffer();

	/** Apply an impulse to one particle. This immediately modifies the
	 *  velocity. Similar to b2Body::ApplyLinearImpulse.
	 *  @param index the particle that will be modified.
	 *  @param impulse the world impulse vector, usually in N-seconds or
     *         kg-m/s. */
	public native void ParticleApplyLinearImpulse(@Cast("int32") int index, @Const @ByRef b2Vec2 impulse);

	/** Apply an impulse to all particles between 'firstIndex' and 'lastIndex'.
	 *  This immediately modifies the velocity. Note that the impulse is
	 *  applied to the total mass of all particles. So, calling
	 *  ParticleApplyLinearImpulse(0, impulse) and
	 *  ParticleApplyLinearImpulse(1, impulse) will impart twice as much
	 *  velocity as calling just ApplyLinearImpulse(0, 1, impulse).
	 *  @param firstIndex the first particle to be modified.
	 *  @param lastIndex the last particle to be modified.
	 *  @param impulse the world impulse vector, usually in N-seconds or
     *         kg-m/s. */
	public native void ApplyLinearImpulse(@Cast("int32") int firstIndex, @Cast("int32") int lastIndex,
								@Const @ByRef b2Vec2 impulse);

	/** Apply a force to the center of a particle.
	 *  @param index the particle that will be modified.
	 *  @param force the world force vector, usually in Newtons (N). */
	public native void ParticleApplyForce(@Cast("int32") int index, @Const @ByRef b2Vec2 force);

	/** Distribute a force across several particles. The particles must not be
	 *  wall particles. Note that the force is distributed across all the
	 *  particles, so calling this function for indices 0..N is not the same as
	 *  calling ParticleApplyForce(i, force) for i in 0..N.
	 *  @param firstIndex the first particle to be modified.
	 *  @param lastIndex the last particle to be modified.
	 *  @param force the world force vector, usually in Newtons (N). */
	public native void ApplyForce(@Cast("int32") int firstIndex, @Cast("int32") int lastIndex, @Const @ByRef b2Vec2 force);

	/** Get the next particle-system in the world's particle-system list. */
	public native b2ParticleSystem GetNext();

	/** Query the particle system for all particles that potentially overlap
	 *  the provided AABB. b2QueryCallback::ShouldQueryParticleSystem is
	 *  ignored.
	 *  @param callback a user implemented callback class.
	 *  @param aabb the query box. */
	public native void QueryAABB(b2QueryCallback callback, @Const @ByRef b2AABB aabb);

	/** Query the particle system for all particles that potentially overlap
	 *  the provided shape's AABB. Calls QueryAABB internally.
	 *  b2QueryCallback::ShouldQueryParticleSystem is ignored.
	 *  @param callback a user implemented callback class.
	 *  @param shape the query shape
	 *  @param xf the transform of the AABB */
	public native void QueryShapeAABB(b2QueryCallback callback, @Const @ByRef b2Shape shape,
							@Const @ByRef b2Transform xf);

	/** Ray-cast the particle system for all particles in the path of the ray.
	 *  Your callback controls whether you get the closest point, any point, or
	 *  n-points. The ray-cast ignores particles that contain the starting
	 *  point. b2RayCastCallback::ShouldQueryParticleSystem is ignored.
	 *  @param callback a user implemented callback class.
	 *  @param point1 the ray starting point
	 *  @param point2 the ray ending point */
	public native void RayCast(b2RayCastCallback callback, @Const @ByRef b2Vec2 point1,
					 @Const @ByRef b2Vec2 point2);

	/** Compute the axis-aligned bounding box for all particles contained
	 *  within this particle system.
	 *  @param aabb Returns the axis-aligned bounding box of the system. */
	public native void ComputeAABB(b2AABB aabb);
	/** enum b2ParticleSystem::b2ExceptionType */
	public static final int
		b2_bufferTooSmall = 0,
		b2_particleIndexOutOfBounds = 1,
		b2_numErrors = 2,
		b2_noExceptions = 3;

	/** Set the velocity of particle at index with direct floats. */
	public native void SetParticleVelocity(@Cast("int32") int index, @Cast("float32") float vx, @Cast("float32") float vy);

	/** Get the x-coordinate of particle at index. */
	public native float GetParticlePositionX(@Cast("int32") int index);

	/** Get the y-coordinate of particle at index. */
	public native float GetParticlePositionY(@Cast("int32") int index);

	/** Copy position buffer into a specified buffer, starting from startIndex. */
	public native int CopyPositionBuffer(int startIndex, int numParticles, Pointer outBuf,
							   int size);

	/** Copy color buffer into a specified buffer, starting from startIndex. */
	public native int CopyColorBuffer(int startIndex, int numParticles, Pointer outBuf,
						    int size);

	/** Copy color buffer into a specified buffer, starting from startIndex. */
	public native int CopyWeightBuffer(int startIndex, int numParticles, Pointer outBuf,
							 int size);
}
